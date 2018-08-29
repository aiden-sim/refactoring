package chapter6.introduceExplainingVariable.after;

/**
 * 직관적 임시변수 사용
 */
public class Example1 {
	private double _quantitiy;
	private double _itemPrice;

	private double price() {
		// 결제액(price) = 총 구매액(
		// base price) -
		// 대량 구매 할인(quantitiy discount) + 배송비(shipping)
		final double basePrice = _quantitiy * _itemPrice;
		final double quantityDiscount = Math.max(0, _quantitiy - 500) * _itemPrice * 0.05;
		final double shipping = Math.min(basePrice * 0.1, 100.0);
		return basePrice - quantityDiscount + shipping;
	}
}
