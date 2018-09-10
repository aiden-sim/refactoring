package chapter8.replaceArraywithObject.after;

public class Basic {
	private void testMethod() {
		Performance row = new Performance();
		row.setName("Liverpool");
		row.setWins("15");

		String name = row.getName();
		int wins = Integer.parseInt(row.getWins());
	}
}

class Performance {
	private String name;
	private String wins;

	public void setName(String name) {
		this.name = name;
	}

	public void setWins(String wins) {
		this.wins = wins;
	}

	public String getName() {
		return name;
	}

	public String getWins() {
		return wins;
	}
}