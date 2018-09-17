package chapter11.extractSubclass.after;

public class JobItem {
	private int _unitPrice;
	private int _quantity;
	protected Employee _employee;
	private boolean _isLabor;

	protected JobItem(int unitPrice, int quantity, boolean isLabor) {
		_unitPrice = unitPrice;
		_quantity = quantity;
		_isLabor = isLabor;
	}

	public JobItem(int unitPrice, int quantity) {
		this(unitPrice, quantity, false);
	}

	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}

	public int getUnitPrice() {
		return _unitPrice;
	}

	public int getQuantity() {
		return _quantity;
	}

	protected boolean isLabor() {
		return false;
	}

}

class LaborItem extends JobItem {

	public LaborItem(int unitPrice, int quantity, boolean isLabor, Employee employee) {
		super(unitPrice, quantity, isLabor);
		_employee = employee;
	}

	public LaborItem(int quantity, Employee employee) {
		super(0, quantity, true);
		_employee = employee;
	}

	/**
	 * 메서드 하향
	 */
	public Employee getEmployee() {
		return _employee;
	}

	@Override
	protected boolean isLabor() {
		return true;
	}

	/**
	 * 메서드 하향
	 * 조건문을 재정의
	 */
	@Override
	public int getUnitPrice() {
		return _employee.getRate();
	}
}