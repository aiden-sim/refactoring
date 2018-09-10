package chapter7.removeMiddleMan.before;

/**
 * 과잉 중개 메서드 제거
 * (점점 위임이 많아 지게 된다.)
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
