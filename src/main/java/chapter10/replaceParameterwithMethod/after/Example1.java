package chapter10.replaceParameterwithMethod.after;

/**
 * 매개변수 세트를 메서드로 전환
 */
public class Example1 {
    private int _quantity = 1;
    private int _itemPrice = 1;

    public double getPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    private double getBasePrice() {
        return _quantity * _itemPrice;
    }

    private int getDiscountLevel() {
        if (_quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }

}
