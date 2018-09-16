package chapter10.replaceErrorCodewithException.after;

/**
 * 에러 부호를 예외 통지로 교체 (확인된 예외)
 */
public class Account2 {
    private int _balance = 10;

    void withdraw(int amount) throws BalanceException {
        if (amount > _balance) {
            throw new BalanceException();
        } else {
            _balance -= amount;
        }
    }

    public static void main(String[] args) {
        Account2 account = new Account2();
        int amount = 11;
        try {
            account.withdraw(amount);
            doTheUsualThing();
        } catch (BalanceException e) {
            handleOverdrawn();
        }
    }

    private static void doTheUsualThing() {
        System.out.println("출금 가능");
    }

    private static void handleOverdrawn() {
        System.out.println("에러");
    }
}
