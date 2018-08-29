package chapter6.removeAssignmentsToParameters.after;

/**
 * 매개변수로의 값 대입 제거
 */
public class basic {
	private int discount(int inputVal, int quantitiy, int yearToDate) {
		int result = inputVal;
		if (inputVal > 50) {
			result -= 2;
		}

		return result;
	}
}
