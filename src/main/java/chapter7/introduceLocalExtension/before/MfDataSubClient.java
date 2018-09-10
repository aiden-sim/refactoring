package chapter7.introduceLocalExtension.before;

import java.util.Date;

public class MfDataSubClient {

	// 원래 Date 클래스에 있어야 할 외래 메서드
	private static Date nextDay(Date arg) {
		return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
	}

	private void execute() {
		Date prviousEnd = new Date();
		nextDay(prviousEnd);
	}
}
