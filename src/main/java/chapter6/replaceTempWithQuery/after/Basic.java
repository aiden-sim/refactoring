package chapter6.replaceTempWithQuery.after;

/**
 * Created by simjunbo on 2018-08-29.
 */

/**
 * 임시변수를 메서드 호출로 전환
 */
public class Basic {
	private double _quantitiy = 5;
	private double _itemPrice = 1000;

	private double getPrice() {
		if (basePrice() > 1000) {
			return basePrice() * 0.95;
		} else {
			return basePrice() * 0.98;
		}
	}

	private double basePrice() {
		return _quantitiy * _itemPrice;
	}
}
