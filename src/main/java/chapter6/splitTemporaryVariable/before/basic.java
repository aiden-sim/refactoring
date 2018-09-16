package chapter6.splitTemporaryVariable.before;

/**
 * 임시변수 분리
 */
public class Basic {
	private double _height;
	private double _width;

	private void tempMethod() {
		double temp = 2 * (_height + _width);
		System.out.println(temp);
		temp = _height * _width;
		System.out.println(temp);
	}
}
