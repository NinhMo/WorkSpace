package exercise.abstraction;

public class DailyStaff extends Employee{

    private int numberOfWorkdays;
    private int salary;

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calcSalary() {
        return salary=numberOfWorkdays*15;
    }

    @Override
    public String toString() {
        return "DailyStaff{" + super.toString()+
                "numberOfWorkdays=" + numberOfWorkdays +
                ", salary=" + salary +
                '}';
    }
}
