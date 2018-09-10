package chapter8.ReplaceSubclasswithFields.after;

/**
 * 하위클래스를 필드로 전환
 */
public class Person {
	/**
	 * 추상화를 메서드 필드로 변경
	 */
	private final boolean _isMale;
	private final char _code;

	protected Person(boolean isMale, char code) {
		_isMale = isMale;
		_code = code;
	}

	boolean isMale() {
		return _isMale;
	}

	static Person createMale() {
		return new Person(true, 'M');
	}

	static Person createFemale() {
		return new Person(false, 'F');
	}
}

class Male extends Person {

	Male() {
		super(true, 'M');
	}
}

class Female extends Person {

	Female() {
		super(false, 'F');
	}
}