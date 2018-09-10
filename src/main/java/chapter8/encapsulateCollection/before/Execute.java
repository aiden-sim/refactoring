package chapter8.encapsulateCollection.before;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class Execute {
	public static void main(String[] args) {
		Person kent = new Person();
		Set s = new HashSet();
		s.add(new Course("스몰토크 프로그래밍", false));
		s.add(new Course("싱글몰트 위스키 음미하기", true));

		kent.setCourses(s);
		Assert.assertEquals(2, kent.getCourses().size());

		Course refact = new Course("리팩토링", true);
		kent.getCourses().add(refact);
		kent.getCourses().add(new Course("지독한 빈정거림", false));
		Assert.assertEquals(4, kent.getCourses().size());

		kent.getCourses().remove(refact);
		Assert.assertEquals(3, kent.getCourses().size());
	}
}
