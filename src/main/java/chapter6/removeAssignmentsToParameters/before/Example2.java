package chapter6.removeAssignmentsToParameters.before;

/**
 * 자바에서 값을 통한 전달 (값)
 */
public class Example2 {
	public static void main(String[] args) {
		int x = 5;
		triple(x);
		System.out.println("triple 메서드 실행 후 x 값 : " + x);
	}

	private static void triple(int arg) {
		arg = arg * 3;
		System.out.println("triple 메서드 안의 arg 값: " + arg);
	}
}
