package chapter7.IntroduceForeignMethod.before;

import java.util.Date;

/**
 * 외래 클래스에 메서드 추가
 */
public class DateExample {

	private void execute() {
		Date prviousEnd = new Date();
		Date newStart = new Date(prviousEnd.getYear(), prviousEnd.getMonth(), prviousEnd.getDate() + 1);
	}
}
