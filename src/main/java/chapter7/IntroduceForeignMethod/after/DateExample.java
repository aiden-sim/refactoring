package chapter7.IntroduceForeignMethod.after;

import java.util.Date;

/**
 * 외래 클래스에 메서드 추가
 */
public class DateExample {

	private void execute() {
		Date prviousEnd = new Date();
		nextDay(prviousEnd);
	}

	private static Date nextDay(Date arg) {
		// Date 클래스에 있을 외래 메서드를 여기에 정의해 놓았다.
		return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
	}
}
