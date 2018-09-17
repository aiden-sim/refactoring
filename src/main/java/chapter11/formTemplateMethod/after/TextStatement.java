package chapter11.formTemplateMethod.after;

public class TextStatement extends Statement {

	@Override
	String headerString(Customer aCustomer) {
		return aCustomer.getName() + " 고객님의 대여 기록\n";
	}

	@Override
	String eachRentalStirng(Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t" +
				String.valueOf(aRental.getCharge()) + "\n";
	}

	@Override
	String footerString(Customer aCustomer) {
		return "누적 대여료 : " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
				"적립 포인트 : " + String.valueOf(aCustomer.getTotalFrequentRenterPoints());
	}
}
