package chapter8.replaceTypeCodewithClass.after;

/**
 * 분류 부호를 클래스로 전환
 */
public class Person {
	private BloodGroup _bloodGroup;

	/**
	 * BloodGroup을 사용하는 메서드
	 */
	public BloodGroup getBloodGroup() {
		return _bloodGroup;
	}

	public Person(BloodGroup bloodGroup) {
		_bloodGroup = bloodGroup;
	}

	public void setBloodGroup(BloodGroup arg) {
		_bloodGroup = arg;
	}

	public static void main(String[] args) {
		Person thePeson = new Person(BloodGroup.A);
		thePeson.getBloodGroup().getCode();
		thePeson.setBloodGroup(BloodGroup.AB);
	}
}
