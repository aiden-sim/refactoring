package chapter6.removeAssignmentsToParameters.after;

import java.util.Date;

/**
 * 자바에서 값을 통한 전달 (레퍼런스)
 * 기본적으로 객체 참조가 값을 통해 전달된다.
 * 속성은 변경할 수 있지만 매개 변수로의 새 값 대입은 고려하지 않는다.
 */
public class Example2 {
	public static void main(String[] args) {
		Date d1 = new Date("1 Apr 98");
		nextDateUpdate(d1);
		System.out.println("nextDay 메서드 실행 후 d1 값 : " + d1);

		Date d2 = new Date("1 Apr 98");
		nextDateReplace(d2);
		System.out.println("nextDay 메서드 실행 후 d2 값 : " + d2);
	}

	private static void nextDateUpdate(Date arg) {
		arg.setDate(arg.getDay() + 1);
		System.out.println("nextDay 메서드 안의 arg 값 : " + arg);
	}

	private static void nextDateReplace(Date arg) {
		arg = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
		System.out.println("nextDay 메서드 안의 arg 값 : " + arg);
	}
}
