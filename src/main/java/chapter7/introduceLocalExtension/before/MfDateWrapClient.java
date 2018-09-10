package chapter7.introduceLocalExtension.before;

import java.util.Date;

public class MfDateWrapClient {
	private static Date nextDay(Date arg) {
		return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
	}

	private void execute() {
		Date prviousEnd = new Date();
		nextDay(prviousEnd);
	}
}
