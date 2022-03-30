package exercise.abstraction;

public class ProductionStaff extends Employee{

    private int amountOfProduct;
    private  int salary;

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calcSalary() {

        return salary-amountOfProduct*20;
    }

    @Override
    public String toString() {
        return "ProductionStaff{" + super.toString()+
                "amountOfProduct=" + amountOfProduct +
                ", salary=" + salary +
                '}';
    }

}
