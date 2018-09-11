package chapter10.parameterizeMethod.after;

/**
 * 메서드를 매개변수로 전환
 */
public class Employee {
	private double salary = 0.0;

	void raise(double factor) {
		salary *= (1 + factor);
	}
}
