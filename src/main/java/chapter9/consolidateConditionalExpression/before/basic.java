package chapter9.consolidateConditionalExpression.before;

/**
 * 중복 조건식 통합
 */
public class basic {
	int _seniority = 1;
	int _monthsDisabled = 13;
	boolean _isPartTime = true;

	double disabilityAmount() {
		if (_seniority < 2) {
			return 0;
		}
		if (_monthsDisabled > 12) {
			return 0;
		}
		if (_isPartTime) {
			return 0;
		}
		return -1;
	}
}
