package chapter9.replaceConditionalwithPolymorphism.after;

/**
 * 조건문을 재정의로 전환
 */
public class Employee {
	private EmployeeType _type;

	int _monthlySalary = 0;
	int _commission = 0;
	int _bonus = 100;

	Employee(EmployeeType type) {
		_type = type;
	}

	public int getMonthlySalary() {
		return _monthlySalary;
	}

	public int getCommission() {
		return _commission;
	}

	public int getBonus() {
		return _bonus;
	}

	int payAmount() {
		return _type.payAmount(this);
	}

	private int getTypeCode() {
		return _type.getTypeCode();
	}

	public static void main(String[] args) {
		Employee employee = new Employee(new Engineer());
		employee.payAmount();
	}
}
