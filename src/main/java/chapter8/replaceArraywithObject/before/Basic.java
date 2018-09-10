package chapter8.replaceArraywithObject.before;

public class Basic {
	private void testMethod() {
		String[] row = new String[3];
		row[0] = "Liverpool";
		row[1] = "15";


		String name = row[0];
		int wins = Integer.parseInt(row[1]);
	}
}
