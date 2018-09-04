package chapter8.ChageValuetoReference.before;

import chapter8.ReplaceDataValueWithObject.after.Customer;

public class Order {
	private Customer _customer;

	public Order(String customerName) {
		_customer = new Customer(customerName);
	}

	public String getCustomerName() {
		return _customer.getName();
	}

	public void setCustomer(String customerName) {
		_customer = new Customer(customerName);
	}
}
