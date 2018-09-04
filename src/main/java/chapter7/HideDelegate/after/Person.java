package chapter7.HideDelegate.after;

/**
 * 대리 객체 은폐 (서버 역할)
 * Client에서 호출 시 john.getManger();
 */
public class Person {
	Department _department;

	public void setDepartment(Department arg) {
		_department = arg;
	}

	public Person getManager() {
		return _department.getManager();
	}
}
