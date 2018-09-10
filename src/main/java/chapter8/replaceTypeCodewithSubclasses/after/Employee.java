package chapter8.replaceTypeCodewithSubclasses.after;

/**
 * 분류 부호를 하위클래스로 전환
 */
public abstract class Employee {
	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	protected Employee() {

	}

	private Employee(int type) {
		_type = type;
	}

	/**
	 * 자체 캡슐화 기법
	 */
	abstract int getType();

	/**
	 * 생성자 메서드를 팩토리 메서드로 변경
	 */
	static Employee create(int type) {
		switch (type) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new SALESMAN();
			case MANAGER:
				return new MANAGER();
			default:
				throw new IllegalArgumentException("분류 부호 값이 잘못됨");
		}
	}
}

class Engineer extends Employee {
	@Override
	int getType() {
		return Employee.ENGINEER;
	}
}

class SALESMAN extends Employee {
	@Override
	int getType() {
		return Employee.SALESMAN;
	}
}

class MANAGER extends Employee {
	@Override
	int getType() {
		return Employee.MANAGER;
	}
}