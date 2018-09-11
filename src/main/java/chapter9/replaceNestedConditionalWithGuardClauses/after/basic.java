package chapter9.replaceNestedConditionalWithGuardClauses.after;

/**
 * 여러 겹의 조건무을 감시 절로 전환
 */
public class basic {
	double getPayAmount() {
		double result;
		boolean _isDead = false;
		boolean _isSeparated = true;
		boolean _isRetired = true;

		if (_isDead) {
			return deadAmount();
		}

		if (_isSeparated) {
			return separatedAmount();
		}

		if (_isRetired) {
			return retiredAmount();
		}

		return normalPayAmount();
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
