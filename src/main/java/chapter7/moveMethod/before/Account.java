package chapter7.moveMethod.before;

/**
 * 메서드 이동
 */
public class Account {
	private AccountType _type;
	private int _daysOverdrawn;

	private double overdraftChange() {
		if (_type.isPremium()) {
			double result = 10;
			if (_daysOverdrawn > 7) {
				result += (_daysOverdrawn - 7) * 0.85;
			}
			return result;
		} else {
			return _daysOverdrawn * 1.75;
		}
	}

	private double bankCharge() {
		double result = 4.5;
		if (_daysOverdrawn > 0) {
			result += overdraftChange();
		}
		return result;
	}
}
