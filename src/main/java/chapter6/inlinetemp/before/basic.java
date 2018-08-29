package chapter6.inlineTemp.before;

/**
 * Created by simjunbo on 2018-08-29.
 */

/**
 * 임시변수를 메서드 호출로 전환
 */
public class basic {
	private boolean moreThanPrice(int price) {
		double basePrice = price;
		return (basePrice > 1000);
	}
}
