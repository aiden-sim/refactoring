package chapter6.replaceMethodWithMethodObject.after;

public class Example1 {
}

class Account {
	public int gamma(int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}

	public int delta() {
		return 1;
	}
}

class Gamma {
	private final Account _account;
	private int _inputVal;
	private int _quantity;
	private int _yearToDate;
	private int _impoartantValue1;
	private int _impoartantValue2;
	private int _impoartantValue3;

	public Gamma(Account source, int inputValArg, int quantitiyArg, int yearToDateArg) {
		this._account = source;
		this._inputVal = inputValArg;
		this._quantity = quantitiyArg;
		this._yearToDate = yearToDateArg;
	}

	public int compute() {
		_impoartantValue1 = (_inputVal * _quantity) + _account.delta();
		_impoartantValue2 = (_inputVal * _yearToDate) + 100;
		importantThing();
		_impoartantValue3 = _impoartantValue2 * 7;
		// 기타 작업
		return _impoartantValue3 - 2 * _impoartantValue1;
	}

	private void importantThing() {
		if ((_yearToDate - _impoartantValue1) > 100) {
			_impoartantValue2 -= 20;
		}
	}
}
