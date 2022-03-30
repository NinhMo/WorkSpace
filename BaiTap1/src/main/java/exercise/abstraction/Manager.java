package exercise.abstraction;

public class Manager extends Employee{

    private int basicSalary;
    private int wage;
    private  int salary;

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calcSalary() {
        return salary=basicSalary*wage;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString()+
                "basicSalary=" + basicSalary +
                ", wage=" + wage +
                ", salary=" + salary +
                '}';
    }
}
