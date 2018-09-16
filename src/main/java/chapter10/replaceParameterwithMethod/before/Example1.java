package chapter10.replaceParameterwithMethod.before;

/**
 * 매개변수 세트를 메서드로 전환
 */
public class Example1 {
    private int _quantity = 1;
    private int _itemPrice = 1;

    public double getPrice() {
        int basePrice = _quantity * _itemPrice;
        int discountLevel;

        if (_quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }

        double finalPrice = discountPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private double discountPrice(int basePrice, int discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }
}
