package chapter9.decomposeConditional.before;

import java.util.Date;

/**
 * 조건문 쪼개기
 */
public class Basic {

	final static Date SUMMER_START = new Date("2018-06-01");
	final static Date SUMMER_END = new Date("2018-12-01");

	public static void main(String[] args) {
		Date date = new Date();
		double charge = 0;
		int quantity = 10;
		double _winterRate = 0.8;
		double _summerRate = 0.5;
		int _winterServiceCharge = 100;

		if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
			charge = quantity * _winterRate + _winterServiceCharge;
		} else {
			charge = quantity * _summerRate;
		}
	}
}
