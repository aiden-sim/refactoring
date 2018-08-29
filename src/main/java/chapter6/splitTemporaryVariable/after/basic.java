package chapter6.splitTemporaryVariable.after;

/**
 * 임시변수 분리
 */
public class basic {
	private double _height;
	private double _width;

	private void tempMethod() {
		final double perimeter = 2 * (_height + _width);
		System.out.println(perimeter);
		final double area = _height * _width;
		System.out.println(area);
	}
}
