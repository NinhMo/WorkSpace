package p2p001;

public class SalariedEmployee extends Employee{
    private double commission;
    private double grossSales;
    private double basicSalary;

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "commission=" + commission +
                ", grossSales=" + grossSales +
                ", basicSalary=" + basicSalary +
                '}';
    }
}
