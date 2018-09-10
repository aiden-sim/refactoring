package chapter7.introduceLocalExtension.after;

import java.util.Date;

/**
 * 하위 클래스 사용
 */
public class MfDateSub extends Date {
	public MfDateSub() {
		super();
	}

	public MfDateSub(String dateString) {
		super(dateString);
	}

	public MfDateSub(Date arg) {
		super(arg.getTime());
	}

	public Date nextDay(Date arg) {
		return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
	}
}
