package chapter8.selfEncapsulateField.before;

/**
 * 필드 자체 캡슐화
 */
public class Basic {

	private int _low, _high;

	boolean includes(int arg) {
		return arg >= _low && arg <= _high;
	}
}
