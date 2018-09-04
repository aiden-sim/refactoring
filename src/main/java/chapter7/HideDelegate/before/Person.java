package chapter7.HideDelegate.before;

/**
 * 대리 객체 은폐
 */
public class Person {
	Department _department;

	public Department getDepartment() {
		return _department;
	}

	public void setDepartment(Department arg) {
		_department = arg;
	}
}
