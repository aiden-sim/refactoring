package chapter10.replaceErrorCodewithException.before;

/**
 * 에러 부호를 예외 통지로 교체
 */
public class Account {
    private int _balance = 10;

    int withdraw(int amount) {
        if (amount > _balance) {
            return -1;
        } else {
            _balance -= amount;
            return 0;
        }
    }

    public static void main(String[] args) {
        Account account = new Account();

        int amount = 11;
        if (account.withdraw(amount) == -1) {
            handleOverdrawn();
        } else {
            doTheUsualThing();
        }
    }

    private static void doTheUsualThing() {
        System.out.println("출금 가능");
    }

    private static void handleOverdrawn() {
        System.out.println("에러");
    }
}
