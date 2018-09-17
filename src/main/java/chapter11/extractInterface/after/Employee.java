package chapter11.extractInterface.after;

public class Employee implements Billable {
	private int _rate;

	public Employee(int rate) {
		_rate = rate;
	}

	public int getRate() {
		return _rate;
	}

	public boolean hasSpecialSkill() {
		return true;
	}
}
