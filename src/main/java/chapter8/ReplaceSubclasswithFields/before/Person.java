package chapter8.ReplaceSubclasswithFields.before;

/**
 * 하위클래스를 필드로 전환
 */
public abstract class Person {
	abstract boolean isMale();

	abstract char getCode();
}

class Male extends Person {

	boolean isMale() {
		return true;
	}

	char getCode() {
		return 'M';
	}
}

class Female extends Person {

	boolean isMale() {
		return false;
	}

	char getCode() {
		return 'F';
	}
}