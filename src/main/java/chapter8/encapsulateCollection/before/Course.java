package chapter8.encapsulateCollection.before;

import chapter8.encapsulateCollection.after.Person;

import java.util.Iterator;

/**
 * 컬렉션 캡슐화
 */
public class Course {
	private String name;
	private boolean isAdvanced;

	public Course(String name, boolean isAdvanced) {
		this.name = name;
		this.isAdvanced = isAdvanced;
	}

	public boolean isAdvanced() {
		return isAdvanced;
	}

	public int numberOfAdvancedCourses(Person person) {
		Iterator iter = person.getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			chapter8.encapsulateCollection.after.Course each = (chapter8.encapsulateCollection.after.Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		return count;
	}
}
