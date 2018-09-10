package chapter8.changeBidirectionalAssociationtoUnidirectional.after;

public class Customer {
	double getDiscount() {
		return 0.0;
	}

	/**
	 * 파라미터 호출하기
	 */
	double getPriceFor(Order order) {
		return order.getDiscountedPrice(this);
	}
}
