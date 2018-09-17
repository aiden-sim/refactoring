package chapter11.extractInterface.before;

public class Employee {
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
