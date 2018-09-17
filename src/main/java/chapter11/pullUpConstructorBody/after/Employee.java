package chapter11.pullUpConstructorBody.after;

/**
 * 생성자 내용 상향
 */
public class Employee {
	protected String _name;
	protected String _id;

	protected Employee(String name, String id) {
		_name = name;
		_id = id;
	}

}

class Manager extends Employee {
	int _grade;

	public Manager(String name, String id, int grade) {
		super(name, id);
		_grade = grade;
	}
}