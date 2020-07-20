package Management;

import Staff.Employee;

public class Director extends Employee {

    private String deptName;
    private double budget;
    private int salary;

    public Director (String name, String NI, int salary, String deptName, Double budget) {
        super(name, NI, salary);
        this.deptName = deptName;
        this.budget = 5000;
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        double bonus = this.salary * 0.2;
        return salary + bonus;
    }
}
