package chapter7.InlineClass.before;

/**
 * 클래스 내용 직접 삽입
 */
public class Person {
	private String _name;
	private TelephoneNumber _officeTelephone = new TelephoneNumber();

	public String getName() {
		return _name;
	}

	public String getTelephoneNumber() {
		return _officeTelephone.getTelephoneNumber();
	}

	TelephoneNumber getOfficeTelephone() {
		return _officeTelephone;
	}
}
