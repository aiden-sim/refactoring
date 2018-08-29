package chapter6.replaceMethodWithMethodObject.after;

public class Basic {
	private double price() {
		// 긴 코드
		return new PriceCalculator(this, 1, 2, 3).compute();
	}

	public double delta() {
		return 1;
	}
}

class PriceCalculator {
	private double _primaryBasePrice;
	private double _secondaryBasePrice;
	private double _tertiaryBasePrice;
	private Basic _basic;

	public PriceCalculator(Basic basic, double primaryBasePrice, double secondaryBasePrice, double tertiaryBasePrice) {
		// 여기서 처리할거 처리
		this._primaryBasePrice = primaryBasePrice;
		this._secondaryBasePrice = secondaryBasePrice;
		this._tertiaryBasePrice = tertiaryBasePrice;
		this._basic = basic;
	}

	public double compute() {
		return _primaryBasePrice + _secondaryBasePrice + _tertiaryBasePrice + _basic.delta();
	}
}
