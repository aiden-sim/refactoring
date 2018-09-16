package chapter9.introduceAssertion.before;

/**
 * 어설션 넣기
 */
public class Basic {
	double getExpenseLimit() {
		Memeber _primaryProject = new Memeber();
		final double NULL_EXPENSE = 0;
		double _expenseLimit = 10;

		return (_expenseLimit != NULL_EXPENSE) ? _expenseLimit : _primaryProject.getMemberExpenseLimit();
	}
}

class Memeber {
	public double getMemberExpenseLimit() {
		return 1.0;
	}
}
