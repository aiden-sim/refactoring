package chapter11.extractSuperclass.after;

public class Employee extends Party {
	private int _annualCost;
	private String _id;

	public Employee(String name, String id, int annualCost) {
		super(name);
		_id = id;
		_annualCost = annualCost;
	}

	@Override
	public int getAnnualCost() {
		return _annualCost;
	}

	public String getId() {
		return _id;
	}
}
