package chapter11.replaceDelegationwithInheritance.before;

/**
 * 위임을 상속으로 전환
 */
public class Employee {
	Person _person = new Person();

	public String getName() {
		return _person.getName();
	}

	public void setName(String arg) {
		_person.setName(arg);
	}

	public String toString() {
		return "사원" + _person.getLastName();
	}
}
