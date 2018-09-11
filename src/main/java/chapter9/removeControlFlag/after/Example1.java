package chapter9.removeControlFlag.after;

/**
 * 제어 플래그 제거
 * break 문으로 교체
 */
public class Example1 {
	void checkSecurity(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Done")) {
				sendAlert();
				break;
			}
			if (people[i].equals("John")) {
				sendAlert();
				break;
			}
		}
	}

	private void sendAlert() {
		System.out.println("찾았음");
	}
}
