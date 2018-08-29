package chapter6.introduceExplainingVariable.before;

/**
 * 메서드 추출
 */
public class Example2 {
	private double _quantitiy;
	private double _itemPrice;

	private double price() {
		// 결제액(price) = 총 구매액(
		// base price) -
		// 대량 구매 할인(quantitiy discount) + 배송비(shipping)
		return _quantitiy * _itemPrice -
				Math.max(0, _quantitiy - 500) * _itemPrice * 0.05 +
				Math.min(_quantitiy * _itemPrice * 0.1, 100.0);
	}
}
