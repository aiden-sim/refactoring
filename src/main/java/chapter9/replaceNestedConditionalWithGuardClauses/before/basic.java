package chapter9.replaceNestedConditionalWithGuardClauses.before;

/**
 * 여러 겹의 조건무을 감시 절로 전환
 */
public class Basic {
	double getPayAmount() {
		double result;
		boolean _isDead = false;
		boolean _isSeparated = true;
		boolean _isRetired = true;

		if (_isDead) {
			result = deadAmount();
		} else {

			if (_isSeparated) {
				result = separatedAmount();
			} else {
				if (_isRetired) {
					result = retiredAmount();
				} else {
					result = normalPayAmount();
				}
			}
		}
		return result;
	}

	private double separatedAmount() {
		return 0;
	}

	private double normalPayAmount() {
		return 0;
	}

	private double retiredAmount() {
		return 0;
	}

	private double deadAmount() {
		return 0;
	}
}
