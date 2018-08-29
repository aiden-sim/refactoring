package chapter6.removeAssignmentsToParameters.before;

/**
 * 매개변수로의 값 대입 제거
 */
public class Example1 {
	private int discount(int inputVal, int quantity, int yearToDate) {
		if (inputVal > 50) {
			inputVal -= 2;
		}

		if (quantity > 100) {
			inputVal -= 1;
		}

		if (yearToDate > 10000) {
			inputVal -= 4;
		}
		return inputVal;
	}
}
