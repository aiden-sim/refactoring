package chapter10.replaceConstructorwithFactoryMethod.after.example2;

/**
 * 문자열을 사용하는 하위클래스 작성
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    @Deprecated
    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return create("Engineer");
            case SALESMAN:
                return create("Salesman");
            case MANAGER:
                return create("Manager");
            default:
                throw new IllegalArgumentException("없는 분류 부호 값");
        }
    }

    static Employee create(String name) {
        try {
            return (Employee) Class.forName(name).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("객체 " + name + "를 인스턴스화할 수 없음");
        }
    }

    public static void main(String[] args) {
        //Employee eng = Employee.create(Employee.ENGINEER);
        Employee eng = Employee.create("Engineer");
    }
}

class Engineer extends Employee {

}

class Salesman extends Employee {

}

class Manager extends Employee {

}