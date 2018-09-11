package chapter9.consolidateDuplicateConditionalFragments.before;

public class basic {
	public static void main(String[] args) {
		double total = 0.0;
		int price = 1000;

		if (isSpecialDeal()) {
			total = price * 0.95;
			send();
		} else {
			total = price * 0.98;
			send();
		}
	}

	private static void send() {
		System.out.println("send");
	}

	private static boolean isSpecialDeal() {
		return true;
	}
}
