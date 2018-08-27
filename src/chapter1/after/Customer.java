package chapter1.after;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by simjunbo on 2018-08-27.
 */
public class Customer {
	private String _name;
	private Vector _rentals = new Vector();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	/**
	 * 4) Customer.amountFor 메서드 내용을 다음과 같이 수정해서 새 메서드로 처리를 넘긴다.
	 */
	private double amountFor(Rental aRental) {
		return aRental.getCharge();
	}

	public String statement() {
		/**
		 * 8) 임시변수를 메서드 호출로 전환 기법을 실시해서 totalAmount 변수와 frequentRenterPoints 변수를 질의 메서드로 고친다.
		 * 질의 메서드 : 필요한 값을 반환하고자 호출되는 메서드
		 */
		//double totalAmount = 0;
		//int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = getName() + "고객님의 대여 기록\n";
		while (rentals.hasMoreElements()) {
			/**
			 * 5) thisAmount는 불필요한 중복이다. each.charge 메서드의 결과를 저장하는데만 사용된다. (임시변수를 메서드 호출로 전환)
			 * 임시 변수는 최대한 없애는것이 좋다.
			 */
			Rental each = (Rental) rentals.nextElement();

			// 비디오 종류별 대여료 계산
			// thisAmount = amountFor(each);

			/**
			 * 7) Rental로 메서드 추출한 frequentRenterPoints을 호출
			 */
			// frequentRenterPoints += each.getFrequentRenterPoints();

			// 이번에 대여하는 비디오 정보와 대여료 출력
			result += "\t" + each.getMovie().getTitle() + "\t" +
					String.valueOf(each.getCharge()) + "\n";
		}
		// 푸터 행 추가
		result += "누적 대여료 : " + String.valueOf(getTotalCharge()) + "\n";
		result += "적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints());
		return result;
	}

	/**
	 * 9) totalAmount를 메서드 호출 전환 기법을 사용해서 메서드로 변경
	 * 하지만 질의 메서드 안에 루프를 넣다보니 코드가 중복되고 좀 더 복잡해보인다.
	 */
	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	/**
	 * 10) frequentRenterPoints도 메서드 호출 전환 기법을 사용해서 메서드로 변경했다.
	 * 하지만 중복코드가 발생했다. 루프가 3번 반복되기 때문에 성능저하가 발생한다.
	 */
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	/**
	 * 11) 잠시 리팩토링을 멈추고 기능을 추가했다.
	 */
	public String htmlStatement() {
		Enumeration rentals = _rentals.elements();
		String result = "<H1><EM>" + getName() + " 고객님의 대여 기록</EM></H1><P>\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();

			result += "\t" + each.getMovie().getTitle() + "\t" +
					String.valueOf(each.getCharge()) + "\n";
		}
		// 푸터 행 추가
		result += "<P>누적 대여료 : <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "적립 포인트 : <EM>" + String.valueOf(getTotalFrequentRenterPoints()) + "</EM><P>";
		return result;
	}
}
