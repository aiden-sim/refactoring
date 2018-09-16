package chapter10.introduceParameterObject.after;

import java.util.Date;

public class DateRange {
    private final Date _start;
    private final Date _end;

    DateRange(Date start, Date end) {
        _start = start;
        _end = end;
    }

    /**
     * 매개변수 객체화 뿐만 아니라
     * 매개변수를 이용해서 기존 기능을 메서드로 옮길수도 있다.
     */
    boolean includes(Date arg) {
        return (arg.equals(_start) || arg.equals(_end) ||
                (arg.after(_start) && arg.before(_end)));
    }

    Date getStart() {
        return _start;
    }

    Date getEnd() {
        return _end;
    }
}
