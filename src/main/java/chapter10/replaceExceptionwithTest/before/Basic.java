package chapter10.replaceExceptionwithTest.before;

/**
 * 예외 처리를 테스트로 교체
 */
public class Basic {
    Integer[] _values = new Integer[10];

    double getValueForPeriod(int peroidNumber) {
        try {
            return _values[peroidNumber];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }
}
