package chapter9.replaceConditionalwithPolymorphism.before;

/**
 * 조건문을 재정의로 전환
 */
public class Employee {
	private EmployeeType _type;

	Employee(EmployeeType type) {
		_type = type;
	}

	int _monthlySalary = 0;
	int _commission = 0;
	int _bonus = 100;

	int payAmount() {
		switch (getTypeCode()) {
			case EmployeeType.ENGINEER:
				return _monthlySalary;
			case EmployeeType.SALESMAN:
				return _monthlySalary + _commission;
			case EmployeeType.MANAGER:
				return _monthlySalary + _bonus;
			default:
				throw new RuntimeException("사원이 잘못됨");
		}
	}

	private int getTypeCode() {
		return _type.getTypeCode();
	}
}
