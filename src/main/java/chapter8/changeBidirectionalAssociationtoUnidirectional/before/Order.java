package chapter8.changeBidirectionalAssociationtoUnidirectional.before;

/**
 * 클래스의 단방향 연결을 양방향으로 전환
 */
public class Order {
	private Customer _customer;

	double getDiscountedPrice() {
		return getGrossPrice() * (1 - _customer.getDiscount());
	}

	double getGrossPrice() {
		return 1.0;
	}
}
