package chapter6.replaceMethodWithMethodObject.before;

public class Basic {
	private double price() {
		double primaryBasePrice = 1;
		double secondaryBasePrice = 2;
		double tertiaryBasePrice = 3;
		// 긴 코드
		return primaryBasePrice + secondaryBasePrice + tertiaryBasePrice;
	}
}
