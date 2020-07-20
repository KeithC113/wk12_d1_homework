package Staff;

public abstract class Employee {

    String name;
    String NI;
    int salary;

    public Employee(String name, String NI, int salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(Double salaryRaise){
        double amountToRaise = ((salaryRaise * salaryRaise)/salaryRaise) * salary;
        this.salary += salaryRaise;
    }

    public double payBonus() {
       double bonus = this.salary * 0.1;
       return salary + bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

}
