package chapter7.moveField.after;

/**
 * 필드 이동
 */
public class Account {
	private AccountType _type;

	private double interestForAmount_days(double amount, int days) {
		return getIntersetRate() * amount * days / 365;
	}

	/**
	 * 많은 메서드가 _interestRate 필드를 사용한다면 필드 자체를 캡슐화 한다
	 */
	private void setIntersetRate(double arg) {
		_type.setInterestRate(arg);
	}

	private double getIntersetRate() {
		return _type.getIntersetRate();
	}
}
