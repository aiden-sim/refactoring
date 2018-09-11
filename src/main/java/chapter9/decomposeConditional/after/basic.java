package chapter9.decomposeConditional.after;

import java.util.Date;

/**
 * 조건문 쪼개기
 */
public class basic {

	final static Date SUMMER_START = new Date("2018-06-01");
	final static Date SUMMER_END = new Date("2018-12-01");
	static double charge = 0;
	static int quantity = 10;
	static double _winterRate = 0.8;
	static double _summerRate = 0.5;
	static int _winterServiceCharge = 100;

	public static void main(String[] args) {
		Date date = new Date();

		if (notSummer(date)) {
			charge = winterCharge(quantity);
		} else {
			charge = summerCharge(quantity);
		}
	}

	private static boolean notSummer(Date date) {
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}

	private static double summerCharge(int quantity) {
		return quantity * _summerRate;
	}

	private static double winterCharge(int quantity) {
		return quantity * _winterRate + _winterServiceCharge;
	}
}
