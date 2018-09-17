package chapter8.encapsulateField.after;

/**
 * 필드 캡슐화
 */
public class Basic {
	private String _name;

	public void setName(String name) {
		this._name = name;
	}

	public String getName() {
		return _name;
	}
}
