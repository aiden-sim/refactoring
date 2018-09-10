package chapter8.encapsulateCollection.before;

import java.util.Set;

public class Person {
	private Set _courses;

	public Set getCourses() {
		return _courses;
	}

	public void setCourses(Set arg) {
		_courses = arg;
	}
}
