package chapter10.parameterizeMethod.before;

/**
 * 메서드를 매개변수로 전환
 */
public class Employee {
	private double salary = 0.0;

	void tenPercentRaise() {
		salary *= 1.1;
	}

	void fivePercentRaise() {
		salary *= 1.05;
	}
}
