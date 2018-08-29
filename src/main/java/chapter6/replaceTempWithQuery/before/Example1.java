package chapter6.replaceTempWithQuery.before;

/**
 * Created by simjunbo on 2018-08-29.
 */
public class Example1 {
	private int _quantitiy = 5;
	private int _itemPrice = 1000;

	private double getPrice() {
		int basePrice = _quantitiy * _itemPrice;
		double discountFactor;
		if (basePrice > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}
}
