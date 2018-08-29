package chapter6.extractMethod.after;

/**
 * Created by simjunbo on 2018-08-28.
 */

import chapter6.extractMethod.Order;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 임시 변수가 복잡한 작업을 할 경우
 */
public class Example4 {
	private Vector _ordres = new Vector<Order>();
	private String _name;

	public Example4() {
		_ordres.add(new Order("apple", 1000));
		_ordres.add(new Order("banana", 2000));
	}

	public void printOwing(double previousAmount) {
		// 메서드 분리
		printBanner();
		/**
		 * 이전 값을 매개변수로 전달
		 * 개인적으로 궁금한 부분은 이렇게 임시변수를 사용 안할경우 디버깅이나 가독성에 불편이 있지 않을까?
		 */
		double outstanding = getOutstanding(previousAmount * 1.2);
		printDetails(outstanding);
	}

	private void printBanner() {

		// 배너 출력
		System.out.println("***************");
		System.out.println("****고객 외상***");
		System.out.println("***************");
	}

	private void printDetails(double outstanding) {
		// 세부 내역 출력
		System.out.println("고객명: " + _name);
		System.out.println("외상액: " + outstanding);
	}

	private double getOutstanding(double initialValue) {
		double result = initialValue;
		Enumeration e = _ordres.elements();

		// 외상액 계산
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}
}
