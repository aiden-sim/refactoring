package chapter7.introduceLocalExtension.before;

import java.util.Date;

/**
 * 하위 클래스 사용
 */
public class MfDateSub extends Date {
	public MfDateSub(String dateString) {
		super(dateString);
	}

	public MfDateSub(Date arg) {
		super(arg.getTime());
	}
}
