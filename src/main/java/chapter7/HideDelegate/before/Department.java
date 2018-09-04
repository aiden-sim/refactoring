package chapter7.HideDelegate.before;

/**
 * 대리 객체 은폐
 */
public class Department {
	private String _chargeCode;
	private Person _manager;

	public Department(Person manager) {
		_manager = manager;
	}

	public Person getManager() {
		return _manager;
	}

	public String getChageCode() {
		return _chargeCode;
	}

	public void setChageCode(String arg) {
		this._chargeCode = arg;
	}
}
