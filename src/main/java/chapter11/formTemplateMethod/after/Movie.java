package chapter11.formTemplateMethod.after;

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;

	public String getTitle() {
		return _title;
	}

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
		//_priceCode = priceCode;
	}

	private Price _price;

	/**
	 * 상태 패턴
	 */
	public void setPriceCode(int arg) {
		switch (arg) {
			case REGULAR:
				_price = new RegularPrice();
				break;
			case CHILDRENS:
				_price = new ChildrensPrice();
				break;
			case NEW_RELEASE:
				_price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("가격 코드가 잘못됐습니다.");
		}
	}

	public double getCharge(int dayRented) {
		return _price.getCharge(dayRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
}
