package chapter8.replaceTypeCodewithSubclasses.before;

/**
 * 분류 부호를 하위클래스로 전환
 */
public class Employee {
	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	Employee(int type) {
		_type = type;
	}
}
