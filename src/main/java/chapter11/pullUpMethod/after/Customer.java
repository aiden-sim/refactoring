package chapter11.pullUpMethod.before;

import java.util.Date;

/**
 * 메서드 상향
 */
public class Customer {

}

class Regular extends Customer {
	void createBill(Date date) {
		double chargeAmount = chargeFor(date);
	}

	double chargeFor(Date date) {
		Date now = new Date();
		if (date.after(now)) {
			return 1;
		} else {
			return 0;
		}
	}
}

class Preferred extends Customer {
	void createBill(Date date) {
		double chargeAmount = chargeFor(date);
	}

	double chargeFor(Date date) {
		Date now = new Date();
		if (date.after(now)) {
			return 2;
		} else {
			return 0;
		}
	}
}