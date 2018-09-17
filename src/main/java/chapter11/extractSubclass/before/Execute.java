package chapter11.extractSubclass.before;

public class Execute {
	public static void main(String[] args) {
		Employee kent = new Employee(5);
		JobItem j1 = new JobItem(0, 5, true, kent);
	}
}
