package chapter6.replaceTempWithQuery.before;

/**
 * Created by simjunbo on 2018-08-29.
 */

/**
 * 임시변수를 메서드 호출로 전환
 */
public class basic {
	private double _quantitiy = 5;
	private double _itemPrice = 1000;

	private double getPrice() {
		final double basePrice = _quantitiy * _itemPrice;
		if (basePrice > 1000) {
			return basePrice * 0.95;
		} else {
			return basePrice * 0.98;
		}
	}
}
