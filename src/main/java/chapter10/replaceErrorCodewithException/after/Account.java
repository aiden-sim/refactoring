package chapter10.replaceErrorCodewithException.after;

/**
 * 에러 부호를 예외 통지로 교체 (미확인 예외)
 */
public class Account {
    private int _balance = 10;

    void withdraw(int amount) {
        if (amount > _balance) {
            throw new IllegalArgumentException("액수가 너무 큽니다");
        }
        _balance -= amount;
    }

    boolean canWithDraw(int amount) {
        if (_balance > amount) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Account account = new Account();

        int amount = 11;
        if (!account.canWithDraw(amount)) {
            handleOverdrawn();
        } else {
            account.withdraw(amount);
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