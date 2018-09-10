package chapter8.chageValuetoReference.after;

public class Order {
	private Customer _customer;

	public Order(String customer) {
		_customer = Customer.getNamed(customer);
	}

	public String getCustomerName() {
		return _customer.getName();
	}
}
