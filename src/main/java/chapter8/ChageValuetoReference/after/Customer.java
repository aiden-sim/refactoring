package chapter8.ChageValuetoReference.after;

import java.util.HashMap;
import java.util.Map;

public class Customer {
	private static Map<String, Customer> _instances = new HashMap<String, Customer>();

	/**
	 * 정적 팩토리 메서드
	 */
	public static Customer getNamed(String name) {
		return _instances.get(name);
	}

	public static void loadCustomers() {
		new Customer("우리 렌터카").store();
		new Customer("커피 자판기 운영업 협동조합").store();
		new Customer("삼천리 가스 공장").store();
	}

	private void store() {
		_instances.put(this.getName(), this);
	}

	private final String _name;

	private Customer(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}
}
