package chapter8.changeBidirectionalAssociationtoUnidirectional.before;

public class Customer {
	double getDiscount() {
		return 0.0;
	}

	double getPriceFor(Order order) {
		return order.getDiscountedPrice();
	}
}
