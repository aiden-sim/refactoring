package chapter6.inlineMethod.after;

/**
 * Created by simjunbo on 2018-08-29.
 */

/**
 * 메서드 내용 직접 삽입
 */
public class Basic {
	private int _numberOfLateDeliveries = 10;

	private int getRating() {
		return (_numberOfLateDeliveries > 5) ? 2 : 1;
	}
}
