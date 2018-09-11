package chapter9.consolidateConditionalExpression.after;

/**
 * 중복 조건식 통합
 */
public class basic {
	int _seniority = 1;
	int _monthsDisabled = 13;
	boolean _isPartTime = true;

	double disabilityAmount() {
		if (isNotElgibleForDisability()) {
			return 0;
		}

		return -1;
	}

	private boolean isNotElgibleForDisability() {
		return (_seniority < 2) || (_monthsDisabled > 12) || (_isPartTime);
	}
}
