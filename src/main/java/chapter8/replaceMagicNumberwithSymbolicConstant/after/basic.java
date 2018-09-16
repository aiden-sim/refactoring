package chapter8.replaceMagicNumberwithSymbolicConstant.after;

/**
 * 마법 숫자를 기호 상수로 전환
 */
public class Basic {
	static final double GRAVITATIONAL_CONSTANT = 9.81;

	double potentialEnergy(double mass, double height) {
		return mass * GRAVITATIONAL_CONSTANT * height;
	}
}
