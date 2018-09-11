package chapter10.renameMethod.before;

/**
 * 메서드명 변경
 */
public class basic {
	public String getTelephoneNumber() {
		int _officeNumber = 100;
		String _officeAreaCode = "seoul";
		return ("(" + _officeAreaCode + ") " + _officeNumber);
	}
}
