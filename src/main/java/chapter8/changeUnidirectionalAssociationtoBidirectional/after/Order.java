package chapter8.changeUnidirectionalAssociationtoBidirectional.after;

import java.util.HashSet;
import java.util.Set;

/**
 * 클래스의 단방향 연결을 양방향으로 전환
 */
public class Order {
	private Customer customer;
	private Set<Customer> _customers = new HashSet<Customer>();

	Customer getCustomer() {
		return customer;
	}

	/**
	 * 1) 일 대 다
	 */
	void setCustomer(Customer arg) {
		if (customer != null) {
			customer.friendOrders().remove(this);
		}

		customer = arg;

		if (customer != null) {
			customer.friendOrders().add(this);
		}
	}

	/**
	 * 2) 다 대 다
	 */
	void addCustomer(Customer arg) {
		arg.friendOrders().add(this);
		_customers.add(arg);
	}

	void removeCustomer(Customer arg) {
		arg.friendOrders().remove(this);
		_customers.remove(arg);
	}
}
