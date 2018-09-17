package chapter10.renameMethod.before;

/**
 * 메서드명 변경
 */
public class Basic {
	public String getTelephoneNumber() {
		int _officeNumber = 100;
		String _officeAreaCode = "seoul";
		return ("(" + _officeAreaCode + ") " + _officeNumber);
	}
}
