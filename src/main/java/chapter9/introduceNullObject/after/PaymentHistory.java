package chapter9.introduceNullObject.after;

public class PaymentHistory {
	static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}

	int getWeeksDelinquentInLastYear() {
		return 10;
	}
}

class NullPaymentHistory extends PaymentHistory {
	@Override
	int getWeeksDelinquentInLastYear() {
		return 0;
	}
}
