package chapter11.replaceDelegationwithInheritance.before;
/**
 * 위임을 상속으로 전환
 */
public class Person {
	String _name;

	public String getName() {
		return _name;
	}

	public void setName(String arg) {
		_name = arg;
	}

	public String getLastName() {
		return _name.substring(_name.lastIndexOf(' ') + 1);
	}
}
