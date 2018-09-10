package chapter8.encapsulateCollection.after;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class Execute {
	public static void main(String[] args) {
		Person kent = new Person();
		kent.addCourse(new Course("스몰토크 프로그래밍", false));
		kent.addCourse(new Course("싱글몰트 위스키 음미하기", true));

		Assert.assertEquals(2, kent.numberOfCourses());

		Course refact = new Course("리팩토링", true);
		kent.addCourse(refact);
		kent.addCourse(new Course("지독한 빈정거림", false));
		Assert.assertEquals(4, kent.numberOfCourses());

		kent.removeCourse(refact);
		Assert.assertEquals(3, kent.numberOfCourses());
	}
}
