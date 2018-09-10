package chapter8.encapsulateCollection.after;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
	private Set _courses = new HashSet();

	public Set getCourses() {
		return Collections.unmodifiableSet(_courses);
	}

	/**
	 * 쓰기 메서드
	 */
	public void initializeCourses(Set arg) {
		_courses.addAll(arg);
	}

	public void addCourse(Course arg) {
		_courses.add(arg);
	}

	public void removeCourse(Course arg) {
		_courses.remove(arg);
	}

	public int numberOfCourses() {
		return _courses.size();
	}

	/**
	 * 기능을 클래스 안으로 옮기기 (메서드 추출)
	 */
	public int numberOfAdvancedCourses(Person person) {
		Iterator iter = person.getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		return count;
	}
}
