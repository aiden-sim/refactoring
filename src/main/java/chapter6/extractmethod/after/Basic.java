package chapter6.extractMethod.after;

/**
 * Created by simjunbo on 2018-08-28.
 */

/**
 * 메서드 추출
 */
public class Basic {
    private String _name;

    public void printOwing(double amount) {
        printBanner();
        printDetails(amount);
    }

    private void printBanner() {
        System.out.println("banner");
    }

    // 매개변수로 사용 했다.
    private void printDetails(double amount) {
        System.out.println("name : " + _name);
        System.out.println("amount : " + amount);
    }
}
