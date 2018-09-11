package chapter9.removeControlFlag.after;

/**
 * 제어 플래그 제거
 * return 문으로 교체
 */
public class Example2 {
	void checkSecurity(String[] people) {
		String found = foundMiscreant(people);
		someLaterCode(found);
	}

	String foundMiscreant(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Done")) {
				sendAlert();
				return "Done";
			}
			if (people[i].equals("John")) {
				sendAlert();
				return "John";
			}
		}
		return "";
	}

	private void someLaterCode(String found) {
		System.out.println(found);
	}

	private void sendAlert() {
		System.out.println("찾았음");
	}
}
