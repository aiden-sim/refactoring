package chapter8.ChageReferencetoValue.after;

public class Currency {
	private String _code;

	public String getCode() {
		return _code;
	}

	private Currency(String code) {
		_code = code;
	}

	@Override
	public boolean equals(Object arg) {
		if (!(arg instanceof Currency)) {
			return false;
		}
		Currency other = (Currency) arg;
		return (_code.equals(other._code));
	}

	@Override
	public int hashCode() {
		return _code.hashCode();
	}
}
