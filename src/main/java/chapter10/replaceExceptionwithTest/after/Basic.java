package chapter10.replaceExceptionwithTest.after;

/**
 * 예외 처리를 테스트로 교체
 */
public class Basic {
    Integer[] _values = new Integer[10];

    double getValueForPeriod(int peroidNumber) {
        if (peroidNumber >= _values.length) {
            return 0;
        } else {
            return _values[peroidNumber];
        }
    }
}
