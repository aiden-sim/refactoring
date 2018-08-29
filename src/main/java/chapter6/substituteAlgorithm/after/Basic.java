package chapter6.substituteAlgorithm.after;

import java.util.Arrays;
import java.util.List;

/**
 * 알고리즘 전환
 */
public class Basic {
	private String foundPerson(String[] people) {
		List<String> candidates = Arrays.asList(new String[] { "Done", "John", "Kent" });
		for (int i = 0; i < candidates.size(); i++) {
			if (candidates.contains(people[i])) {
				return people[i];
			}
		}
		return "";
	}
}
