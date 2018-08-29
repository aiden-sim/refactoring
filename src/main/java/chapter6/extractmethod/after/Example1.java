package chapter6.extractMethod.after;

/**
 * Created by simjunbo on 2018-08-28.
 */

import chapter6.extractMethod.Order;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 지역변수 사용 안 함
 */
public class Example1 {
	private Vector _ordres = new Vector<Order>();
	private String _name;

	public Example1() {
		_ordres.add(new Order("apple", 1000));
		_ordres.add(new Order("banana", 2000));
	}

	public void printOwing() {
		Enumeration e = _ordres.elements();
		double outstanding = 0.0;

		// 메서드 분리
		printBanner();

		// 외상액 계산
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}

		// 세부 내역 출력
		System.out.println("고객명: " + _name);
		System.out.println("외상액: " + outstanding);
	}

	private void printBanner() {

		// 배너 출력
		System.out.println("***************");
		System.out.println("****고객 외상***");
		System.out.println("***************");
	}
}
