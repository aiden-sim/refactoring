package chapter11.pullUpConstructorBody.before;

/**
 * 생성자 내용 상향
 */
public class Employee {
	protected String _name;
	protected String _id;

}

class Manager extends Employee {
	int _grade;

	public Manager(String name, String id, int grade) {
		_name = name;
		_id = id;
		_grade = grade;
	}
}