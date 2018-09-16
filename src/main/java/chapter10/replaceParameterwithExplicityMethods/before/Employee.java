package chapter10.replaceParameterwithExplicityMethods.before;

/**
 * 매개변수를 메서드로 전환
 */
public class Employee {
    static final int ENGINER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("없는 분류 부호 값");
        }
    }
}


class Engineer extends Employee {

}

class Salesman extends Employee {

}

class Manager extends Employee {

}