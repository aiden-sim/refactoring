package chapter8.changeBidirectionalAssociationtoUnidirectional.after;

/**
 * 클래스의 단방향 연결을 양방향으로 전환
 */
public class Order {
	/**
	 * 파라미터 방식으로 변경한다.
	 */
	double getDiscountedPrice(Customer customer) {
		return getGrossPrice() * (1 - customer.getDiscount());
	}

	double getGrossPrice() {
		return 1.0;
	}
}
