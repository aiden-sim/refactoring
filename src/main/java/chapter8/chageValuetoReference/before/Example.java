package chapter8.chageValuetoReference.before;

import java.util.Collection;
import java.util.Iterator;

public class Example {
	private static int numberOfOrdersFor(Collection orders, String customer) {
		int result = 0;
		Iterator iter = orders.iterator();
		while (iter.hasNext()) {
			Order each = (Order) iter.next();
			if (each.getCustomerName().equals(customer)) {
				result++;
			}
		}
		return result;
	}
}
