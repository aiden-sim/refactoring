package chapter9.replaceConditionalwithPolymorphism.after;

public abstract class EmployeeType {
	abstract int getTypeCode();

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	abstract int payAmount(Employee emp);
}

class Engineer extends EmployeeType {
	@Override
	int getTypeCode() {
		return EmployeeType.ENGINEER;
	}

	@Override
	int payAmount(Employee emp) {
		return emp.getMonthlySalary();
	}
}

class Salesman extends EmployeeType {
	@Override
	int getTypeCode() {
		return EmployeeType.SALESMAN;
	}

	@Override
	int payAmount(Employee emp) {
		return emp.getMonthlySalary() + emp.getCommission();
	}
}

class Manager extends EmployeeType {
	@Override
	int getTypeCode() {
		return EmployeeType.MANAGER;
	}

	@Override
	int payAmount(Employee emp) {
		return emp.getMonthlySalary() + emp.getBonus();
	}
}