package chapter7.extractClass.after;

/**
 * 클래스 추출
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
