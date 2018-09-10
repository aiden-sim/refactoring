package chapter8.changeUnidirectionalAssociationtoBidirectional.after;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private Set<Order> _orders = new HashSet<Order>();

	/**
	 * 연결을 병경할 때 Order에 의해서만 사용되어야 함
	 */
	Set friendOrders() {
		return _orders;
	}

	void setOrder(Order arg) {
		arg.setCustomer(this);
	}

	void addOrder(Order arg) {
		arg.addCustomer(this);
	}

	void removeOrder(Order arg) {
		arg.removeCustomer(this);
	}
}
