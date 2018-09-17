package chapter1.after;

/**
 * Created by simjunbo on 2018-08-27.
 */
public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	/**
	 * 13) movie에서 getCharge를 호출하자
	 */
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	/**
	 * 14) movice에서 getFrequentRenterPoints를 호출하자
	 */
	public int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}

	/**
	 * 1) 비디오 종류별 대여료 계산 기능을 빼내어 별도의 함수로 작성 (메서드 추출 기법)
	 * 2) 변수명 수정
	 * 3) Customer에서 Rental로 위치 옮기면서 메서드명도 변경(메서드는 대체로 자신이 사용하는 데이터와 같은 객체에 들어있어야 한다. 메서드 이동 기법)
	 *
	 * 12) 타 객체의 속성을 switch 문의 인자로 하는 것은 나쁜 방법이다. 자신의 데이터를 사용하자.
	 * 이 부분을 Movie class로 옮겼다.
	 */
/*	public double getCharge() {
		double result = 0;
		switch (getMovie().getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (getDaysRented() > 2)
					result += (getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				result += getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (getDaysRented() > 3)
					result += (getDaysRented() - 3) * 1.5;
				break;
		}
		return result;
	}*/

	/**
	 * 6) frequentRenterPoints도 따로 메서드로 뺀다. (메서드 추출 기법)
	 *
	 * 14) 이 부분도 movice로 옮기자
	 */
/*	public int getFrequentRenterPoints() {
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) {
			return 2;
		} else {
			return 1;
		}
	}*/

}
