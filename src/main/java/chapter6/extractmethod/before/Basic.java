package chapter6.extractmethod.before;

/**
 * Created by simjunbo on 2018-08-28.
 */

/**
 * 메서드 추출
 */
public class Basic {
	private String _name;

	public void printOwing(double amount) {
		printBanner();
		System.out.println("name : " + _name);
		System.out.println("amount : " + amount);
	}

	private void printBanner() {
		System.out.println("banner");
	}
}
