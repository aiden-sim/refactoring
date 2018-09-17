package chapter6.removeAssignmentsToParameters.before;

/**
 * 매개변수로의 값 대입 제거
 * (값에 대입을 할경우에 참조를 통한 전달과 혼동될 수 있다.)
 */
public class Basic {
	private int discount(int inputVal, int quantitiy, int yearToDate) {
		if (inputVal > 50) {
			inputVal -= 2;
		}

		return inputVal;
	}

	/**
	 * 참조가 아니기 때문에 메서드 내부에서 반복을 한다고 해도 외부에서 사용할 수 없다.
	 */
	private void discount(int inputVal) {
		if (inputVal > 50) {
			inputVal -= 2;
		}
	}
}
