package chapter8.replaceTypeCodewithClass.enumType;

public enum Person {
	O(0),
	A(1),
	B(2),
	AB(3);

	private int code;

	Person(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
