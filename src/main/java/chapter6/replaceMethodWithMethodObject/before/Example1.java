package chapter6.replaceMethodWithMethodObject.before;

public class Example1 {
}

class Account {
	public int gamma(int inputVal, int quantity, int yearToDate) {
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		int importantValue3 = importantValue2 * 7;
		// 기타 작업
		return importantValue3 - 2 * importantValue1;
	}

	private int delta() {
		return 1;
	}
}
