package chapter6.splitTemporaryVariable.after;

/**
 * 임시변수 분리
 */
public class Example1 {
	private double _primartForce;
	private double _mass;
	private int _delay;
	private double _secondaryForce;

	private double getDistanceTravelled(int time) {
		final int secondaryTime = secondaryTime(time);
		final int primaryTime = primaryTime(time);
		double result = 0.5 * primaryAcc() * primaryTime * primaryTime;

		if (secondaryTime > 0) {
			double primaryVel = primaryAcc() * _delay;
			final double secondaryAcc = (_primartForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 *
					secondaryAcc * secondaryTime * secondaryTime;
		}
		return result;
	}

	private double primaryAcc() {
		return _primartForce / _mass;
	}

	private int primaryTime(int time) {
		return Math.min(time, _delay);
	}

	private int secondaryTime(int time) {
		return time - _delay;
	}
}