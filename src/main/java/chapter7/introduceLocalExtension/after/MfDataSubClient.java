package chapter7.introduceLocalExtension.after;

import java.util.Date;

public class MfDataSubClient {
	public static void main(String[] args) {
		MfDataSubClient test = new MfDataSubClient();
		test.execute();
	}

	private MfDateSub date = new MfDateSub();

	private void execute() {
		Date prviousEnd = new Date();
		date.nextDay(prviousEnd);
	}
}
