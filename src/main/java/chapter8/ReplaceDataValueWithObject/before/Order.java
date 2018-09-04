package chapter8.ReplaceDataValueWithObject.before;

public class Order {
	private String _customer;

	public Order(String customer) {
		_customer = customer;
	}

	public String getCustomer() {
		return _customer;
	}

	public void setCustomer(String arg) {
		_customer = arg;
	}
}
