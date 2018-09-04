package chapter7.IntroduceLocalExtension.before;

import java.util.Date;

/**
 * 래퍼 클래스 사용
 */
public class MfDateWrap {
	private Date _original;

	public MfDateWrap(String dateString) {
		_original = new Date(dateString);
	}

	public MfDateWrap(Date arg) {
		_original = arg;
	}

	public int getYear() {
		return _original.getYear();
	}

	public boolean equals(Object arg) {
		if (this == arg)
			return true;

		if (!(arg instanceof MfDateWrap))
			return false;

		MfDateWrap other = ((MfDateWrap) arg);
		return (_original.equals(other._original));
	}
}
