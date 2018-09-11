package chapter9.replaceNestedConditionalWithGuardClauses.after;

/**
 * 조건문을 역순으로 만들기
 */
public class Example1 {
	public double getAdjustedCapital() {
		double _capital = 1.0;
		double _intRate = 1.0;
		double _duration = 1.0;
		int _income = 10;
		final int ADJ_FACTOR = 2;

		if (_capital <= 0.0) {
			return 0.0;
		}

		if (!(_intRate <= 0.0 && _duration <= 0.0)) {
			return 0.0;
		}

		return (_income / _duration) * ADJ_FACTOR;
	}
}
