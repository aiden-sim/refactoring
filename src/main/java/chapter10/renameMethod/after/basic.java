package chapter10.renameMethod.after;

/**
 * 메서드명 변경
 */
public class basic {

	@Deprecated
	public String getTelephoneNumber() {
		return getOfficeTelephoneNumber();
	}

	/**
	 * getTelephoneNumber 사용 하는 부분을 getOfficeTelephoneNumber로 변경하자
	 */
	public String getOfficeTelephoneNumber() {
		int _officeNumber = 100;
		String _officeAreaCode = "seoul";
		return ("(" + _officeAreaCode + ") " + _officeNumber);
	}
}
