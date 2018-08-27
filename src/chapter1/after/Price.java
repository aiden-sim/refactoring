package chapter1.after;

/**
 * Created by simjunbo on 2018-08-27.
 */

/**
 * 16) Price 클래스를 상속 확장하는 클래스 3개를 추가로 작성
 */
public abstract class Price {
	abstract int getPriceCode();

	/**
	 * 18) Movie 클래스에서 getCharge를 옮겨 왔다.
	 * 하위 클래스에 로직을 분산 시키자. (조건문을 재정의로 전환 기법을 실시)
	 */
	abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}

/**
 * 19) getCharge를 재정의해서 각 자식 클래스에 재정의
 * 20) getFrequentRenterPoints를 재정의 (NewReleasePrice쪽에서만 재정의하고 나머지는 부모꺼 사용한다.)
 */
class RegularPrice extends Price {

	@Override int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}
}

class ChildrensPrice extends Price {

	@Override int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
}

class NewReleasePrice extends Price {

	@Override int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
}
