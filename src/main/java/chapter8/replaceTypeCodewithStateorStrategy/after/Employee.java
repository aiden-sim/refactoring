package chapter8.replaceTypeCodewithStateorStrategy.after;

/**
 * 분류 부호를 상태/전략 패턴으로 전환
 */
public class Employee {
	private EmployeeType _type;
	int _monthlySalary = 0;
	int _commission = 0;
	int _bonus = 100;

	int getType() {
		return _type.getTypeCode();
	}

	void setType(int arg) {
		_type = EmployeeType.newType(arg);
	}

	int payAmount() {
		switch (getType()) {
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
}
