package chapter6.extractmethod.after;

/**
 * Created by simjunbo on 2018-08-28.
 */

import chapter6.extractmethod.Order;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 지역변수를 다시 대입
 */
public class Example3 {
	private Vector _ordres = new Vector<Order>();
	private String _name;

	public Example3() {
		_ordres.add(new Order("apple", 1000));
		_ordres.add(new Order("banana", 2000));
	}

	public void printOwing() {
		/**
		 * 매개 변수로의 값 대입이 있을 경우엔
		 * 즉시 매개변수로의 값 대입 제거를 실시해야 한다.
		 */
		double outstanding = getOustanding();

		// 메서드 분리
		printBanner();

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

	private double getOustanding() {
		Enumeration e = _ordres.elements();
		double result = 0.0;
		// 외상액 계산
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}
}
