package chapter10.separateQueryfromModifier.after;

/**
 * 상태 변경 메서드와 값 반환 메서드를 분리
 */
public class basic {

	void checkSecurity(String[] people) {
		sendAlert(people);
		String found = foundPerson(people);
		someLaterCode(found);
	}

	private void someLaterCode(String found) {
		System.out.println("found : " + found);
	}

	/**
	 * 상태 변경 메서드
	 */
	void sendAlert(String[] people) {
		if (!foundPerson(people).equals("")) {
			sendAlert();
		}
	}

	/**
	 * 부작용이 없는 메서드
	 */
	String foundPerson(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				return "Don";
			}

			if (people[i].equals("John")) {
				return "John";
			}
		}
		return "";
	}

	private void sendAlert() {
	}

}
