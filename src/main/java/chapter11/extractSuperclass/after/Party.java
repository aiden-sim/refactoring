package chapter11.extractSuperclass.after;

public abstract class Party {

	/**
	 * 생성자 내용 상향
	 */
	protected Party(String name) {
		_name = name;
	}

	/**
	 * 필드 상향
	 */
	private String _name;

	/**
	 * 메서드 상향
	 */
	public String getName() {
		return _name;
	}

	abstract public int getAnnualCost();
}
