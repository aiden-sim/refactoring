package chapter8.selfEncapsulateField.after;

/**
 * 필드 자체 캡슐화
 */
public class IntRange {
	private int _low, _high;

	boolean includes(int arg) {
		return arg >= getLow() && arg <= getHigh();
	}

	void grow(int factor) {
		setHigh(getHigh() * factor);
	}

	IntRange(int low, int high) {
		initialize(low, high);
	}

	private void initialize(int low, int high) {
		_low = low;
		_high = high;
	}

	int getLow() {
		return _low;
	}

	int getHigh() {
		return _high;
	}

	void setLow(int arg) {
		_low = arg;
	}

	void setHigh(int arg) {
		_high = arg;
	}
}

/**
 * 초기화 메서드에 직접 접근하면 하위 클래스가 생길 때 편리해진다.
 */
class CappedRange extends IntRange {
	private int _cap;

	CappedRange(int low, int high, int cap) {
		super(low, high);
		_cap = cap;
	}

	int getCap() {
		return _cap;
	}

	int getHigh() {
		return Math.min(super.getHigh(), getCap());
	}
}
