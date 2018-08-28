package chapter1.after;

/**
 * Created by simjunbo on 2018-08-27.
 */
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;

	public String getTitle() {
		return _title;
	}

	/**
	 * 15) 분류 부호에 필드 자체 캡슐화 기법을 적용해서 반드시 읽기/쓰기 메서드를 거쳐서만 분류 부호를 사용할 수 있게 해야 한다.
	 */
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
		//_priceCode = priceCode;
	}

	/**
	 * 17) priceCode를 price로 변경
	 */
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

	/**
	 * 12) Rental에서 옮겨왔다.
	 * 왜 Movice로 옮겼을까? 사용자가 요청한 변경은 단지 새로운 비디오 종류를 추가해 달라는것이었기 때문이다.
	 * 대체로 비디오 종류에 대한 정보는 나중에 변경할 가능성이 높다.
	 * 비디오 종류를 변경해도 그로 인해 미치는 영향을 최소화하고자 대여료 계산을 Movie 클래스 안에 넣었다.
	 * <p>
	 * 18) Price Class로 이돟하자
	 */
	public double getCharge(int dayRented) {
		return _price.getCharge(dayRented);
	}

	/*public double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (daysRented > 2)
					result += (daysRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				result += daysRented * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (daysRented > 3)
					result += (daysRented - 3) * 1.5;
				break;
		}
		return result;
	}*/

	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
	/**
	 * 14) 포인트도 마찬가지로 Rental에서 옮겨왔다.
	 *
	 * 20) getCharge와 마찬가지로 재정의
	 */
/*	public int getFrequentRenterPoints(int daysRented) {
		if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
			return 2;
		} else {
			return 1;
		}
	}*/
}
