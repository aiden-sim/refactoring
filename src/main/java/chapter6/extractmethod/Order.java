package chapter6.extractmethod;

/**
 * Created by simjunbo on 2018-08-28.
 */
public class Order {
	private String name;
	private double amount;

	public Order(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}
}
