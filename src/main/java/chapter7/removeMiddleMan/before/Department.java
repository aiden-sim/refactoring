package chapter7.removeMiddleMan.before;

/**
 * 과잉 중개 메서드 제거
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
