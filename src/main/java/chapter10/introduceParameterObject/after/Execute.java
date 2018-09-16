package chapter10.introduceParameterObject.after;

import java.util.Date;

public class Execute {
    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date();

        Account anAccount = new Account();
        double flow = anAccount.getFlowBetween(new DateRange(startDate, endDate));
    }
}
