package chapter10.replaceParameterwithExplicityMethods.after;

/**
 * 매개변수를 메서드로 전환
 */
public class Employee {
    static final int ENGINER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    /**
     * Employee.create(ENGINER)로 호출 부분을
     * Employee.createEngineer()로 변경 가능
     */
    static Employee create(int type) {
        switch (type) {
            case ENGINER:
                return createEngineeer();
            case SALESMAN:
                return createSalesman();
            case MANAGER:
                return createManager();
            default:
                throw new IllegalArgumentException("없는 분류 부호 값");
        }
    }

    static Employee createEngineeer() {
        return new Engineer();
    }

    static Employee createSalesman() {
        return new Salesman();
    }

    static Employee createManager() {
        return new Manager();
    }
}


class Engineer extends Employee {

}

class Salesman extends Employee {

}

class Manager extends Employee {

}