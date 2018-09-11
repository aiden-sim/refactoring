package chapter9.introduceNullObject.after;

public class BillingPlan {
	static BillingPlan basic() {
		return new BillingPlan();
	}

	static BillingPlan special() {
		return new BillingPlan();
	}
}
