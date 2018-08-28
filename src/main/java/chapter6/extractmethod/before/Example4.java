package chapter6.extractmethod.before;

/**
 * Created by simjunbo on 2018-08-28.
 */

import chapter6.extractmethod.Order;

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
		Enumeration e = _ordres.elements();

		double outstanding = previousAmount * 1.2;

		// 메서드 분리
		printBanner();

		// 외상액 계산
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
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
}
