package p2p001;

public class HourlyEmployee extends Employee{

    private double wage;
    private double workingHours;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() +
                "wage=" + wage +
                ", workingHours=" + workingHours +
                '}';
    }


}
