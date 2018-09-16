package chapter8.encapsulateCollection.after;

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
}
