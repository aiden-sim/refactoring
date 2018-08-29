package chapter6.replaceTempWithQuery.after;

/**
 * Created by simjunbo on 2018-08-29.
 */
public class Example1 {
	private int _quantitiy = 5;
	private int _itemPrice = 1000;

	private double getPrice() {
		return basePrice() * discountFactor();
	}

	private int basePrice() {
		return _quantitiy * _itemPrice;
	}

	private double discountFactor() {
		if (basePrice() > 1000) {
			return 0.95;
		} else {
			return 0.98;
		}
	}
}
