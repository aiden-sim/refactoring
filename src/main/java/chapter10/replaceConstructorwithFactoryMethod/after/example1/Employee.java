package chapter10.replaceConstructorwithFactoryMethod.after.example1;

public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee(int type) {
        _type = type;
    }

    static Employee create(int type) {
        return new Employee(type);
    }

    public static void main(String[] args) {
        Employee eng = Employee.create(Employee.ENGINEER);
    }
}
