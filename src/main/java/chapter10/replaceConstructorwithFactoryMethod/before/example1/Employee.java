package chapter10.replaceConstructorwithFactoryMethod.before.example1;

public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee(int type) {
        _type = type;
    }

    public static void main(String[] args) {
        Employee eng = new Employee(Employee.ENGINEER);
    }
}
