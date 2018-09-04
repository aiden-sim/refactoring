package chapter8.SelfEncapsulateField.after;

/**
 * 필드 자체 캡슐화
 */
public class Basic {

	private int _low, _high;
	boolean includes(int arg) {
		return arg >= getLow() && arg <= getHigh();
	}

	int getLow() {
		return _low;
	}

	int getHigh() {
		return _high;
	}
}
