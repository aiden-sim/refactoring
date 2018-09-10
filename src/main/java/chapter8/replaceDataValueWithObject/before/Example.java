package chapter8.replaceDataValueWithObject.before;

import java.util.Collection;
import java.util.Iterator;

/**
 * Order 사용 코드
 */
public class Example {
	private static int numberOfOrdersFor(Collection orders, String customer) {
		int result = 0;
		Iterator iter = orders.iterator();
		while (((Iterator) iter).hasNext()) {
			Order each = (Order) ((Iterator) iter).next();
			if (each.getCustomer().equals(customer)) {
				result++;
			}
		}
		return result;
	}
}
