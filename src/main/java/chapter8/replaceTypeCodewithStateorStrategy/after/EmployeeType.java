package chapter8.replaceTypeCodewithStateorStrategy.after;

public abstract class EmployeeType {
	abstract int getTypeCode();

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	public static EmployeeType newType(int code) {
		switch (code) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANAGER:
				return new Manager();
			default:
				throw new IllegalArgumentException("사원 부호가 잘못됨");
		}
	}
}

class Engineer extends EmployeeType {
	@Override
	int getTypeCode() {
		return EmployeeType.ENGINEER;
	}
}

class Salesman extends EmployeeType {
	@Override
	int getTypeCode() {
		return EmployeeType.SALESMAN;
	}
}

class Manager extends EmployeeType {
	@Override
	int getTypeCode() {
		return EmployeeType.MANAGER;
	}
}
