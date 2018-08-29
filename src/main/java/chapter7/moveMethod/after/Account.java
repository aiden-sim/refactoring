package chapter7.moveMethod.after;

/**
 * 메서드 이동
 */
public class Account {
	private AccountType _type;
	private int _daysOverdrawn;

	private double overdraftCharge() {
		return _type.overdraftCharge(_daysOverdrawn);
	}

	private double bankCharge() {
		double result = 4.5;
		if (_daysOverdrawn > 0) {
			result += overdraftCharge();
		}
		return result;
	}
}
