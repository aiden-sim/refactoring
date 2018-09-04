package chapter7.InlineClass.after;

/**
 * 클래스 내용 직접 삽입
 */
public class Person {
	private String _name;
	private String _areaCode;
	private String _number;

	public String getName() {
		return _name;
	}

	public String getTelephoneNumber() {
		return ("(" + _areaCode + ") " + _number);
	}

	String getAreaCode() {
		return _areaCode;
	}

	void setAreCode(String arg) {
		_areaCode = arg;
	}

	String getNumber() {
		return _number;
	}

	void setNumber(String arg) {
		_number = arg;
	}
}
