package chapter7.removeMiddleMan.after;

/**
 * 과잉 중개 메서드 제거
 * (점점 위임이 많아 지게 된다.)
 *
 * Client에서 호출 시 john.getDepartment().getManager();
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
