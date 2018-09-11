package chapter9.introduceNullObject.before;

public class Site {
	Customer _customer;

	Customer getCustomer() {
		return _customer;
	}
}

class Customer {
	public String getName() {
		return "test";
	}

	public BillingPlan getPlan() {
		return new BillingPlan();
	}

	public PaymentHistory getHistory() {
		return new PaymentHistory();
	}
}
