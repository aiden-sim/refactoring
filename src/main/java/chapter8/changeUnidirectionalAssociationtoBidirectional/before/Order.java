package chapter8.changeUnidirectionalAssociationtoBidirectional.before;

/**
 * 클래스의 단방향 연결을 양방향으로 전환
 */
public class Order {
	private Customer _customer;

	Customer getCustomer() {
		return _customer;
	}

	void setCustomer(Customer arg) {
		_customer = arg;
	}
}
