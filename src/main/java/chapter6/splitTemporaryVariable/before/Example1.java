package chapter6.splitTemporaryVariable.before;

/**
 * 임시변수 분리
 */
public class Example1 {
	private double _primartForce;
	private double _mass;
	private int _delay;
	private double _secondaryForce;

	private double getDistanceTravelled(int time) {
		double result;
		double acc = _primartForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * acc * primaryTime * primaryTime;

		int secondaryTime = time - _delay;
		if (secondaryTime > 0) {
			double primaryVel = acc * _delay;
			acc = (_primartForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 *
					acc * secondaryTime * secondaryTime;
		}
		return result;
	}
}
