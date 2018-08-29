package chapter7.moveField.before;

/**
 * 필드 이동
 */
public class Account {
	private AccountType _type;
	private double _interestRate;

	private double interestForAmount_days(double amount, int days) {
		return _interestRate * amount * days / 365;
	}
}
