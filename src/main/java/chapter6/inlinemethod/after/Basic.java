package chapter6.inlinemethod.after;

/**
 * Created by simjunbo on 2018-08-29.
 */
public class Basic {
	private int _numberOfLateDeliveries = 10;

	private int getRating() {
		return (_numberOfLateDeliveries > 5) ? 2 : 1;
	}
}
