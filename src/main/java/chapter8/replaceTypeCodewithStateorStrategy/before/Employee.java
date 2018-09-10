package chapter8.replaceTypeCodewithStateorStrategy.before;

/**
 * 분류 부호를 상태/전략 패턴으로 전환
 */
public class Employee {
	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	Employee(int type) {
		_type = type;
	}

	int _monthlySalary = 0;
	int _commission = 0;
	int _bonus = 100;

	int payAmount() {
		switch (_type) {
			case ENGINEER:
				return _monthlySalary;
			case SALESMAN:
				return _monthlySalary + _commission;
			case MANAGER:
				return _monthlySalary + _bonus;
			default:
				throw new RuntimeException("사원이 잘못됨");
		}
	}
}
