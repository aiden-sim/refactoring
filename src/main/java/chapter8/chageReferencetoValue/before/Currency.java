package chapter8.chageReferencetoValue.before;

public class Currency {
	private String _code;

	public String getCode() {
		return _code;
	}

	private Currency(String code) {
		_code = code;
	}
}
