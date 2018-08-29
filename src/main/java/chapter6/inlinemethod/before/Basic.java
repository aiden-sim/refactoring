package chapter6.inlineMethod.before;

/**
 * Created by simjunbo on 2018-08-29.
 */
public class Basic {
	private int _numberOfLateDeliveries = 10;

	private int getRating() {
		return (moreThanFiveLateDeliveries()) ? 2 : 1;
	}

	private boolean moreThanFiveLateDeliveries() {
		return _numberOfLateDeliveries > 5;
	}
}
