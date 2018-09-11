package chapter9.introduceNullObject.before;

public class Execute {

	public void execute() {
		Site site = new Site();
		Customer customer = site.getCustomer();
		BillingPlan plan;

		if (customer == null) {
			plan = BillingPlan.basic();
		} else {
			plan = customer.getPlan();
		}

		String customerName;
		if (customer == null) {
			customerName = "occupant";
		} else {
			customerName = customer.getName();
		}

		int weeksDelinquent;
		if (customer == null) {
			weeksDelinquent = 0;
		} else {
			weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
		}
	}
}
