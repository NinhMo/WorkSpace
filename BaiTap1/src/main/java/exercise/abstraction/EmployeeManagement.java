package exercise.abstraction;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {

    private List<Employee> listOfEmployee = new ArrayList<>();
    private DailyStaff dailyStaff;
    private Manager manager;
    private ProductionStaff productionStaff;


    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(List<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    public void setListOfEmployee(Employee employee){
        this.listOfEmployee.add(employee);
    }

    @Override
    public String toString() {
        return "EmployeeManagement{" +
                "listOfEmployee=" + listOfEmployee +
                ", dailyStaff=" + dailyStaff +
                ", manager=" + manager +
                ", productionStaff=" + productionStaff +
                '}';
    }

    public void display(){

    }

    public static void main(String[] args) {

        Employee production = new ProductionStaff();
        Employee management = new Manager();
        Employee dailyStaff = new DailyStaff();

        EmployeeManagement employeeManagement = new EmployeeManagement();
        List<Employee> listOfEmployee = new ArrayList<>();

        production.setEmployeeName("Ninh Thi Mo");
        production.setDatOfBirth("15/1/1992");
        production.setAddress("Nam Định");

        management.setEmployeeName("Nguyen Duc Thuan ");
        management.setDatOfBirth("24/8/1993");
        management.setAddress("Ha Noi");

        dailyStaff.setEmployeeName("Nguyen Dinh Tung ");
        dailyStaff.setDatOfBirth("16/12/1992");
        dailyStaff.setEmployeeName("Vinh Phuc");

        listOfEmployee.add(production);
        listOfEmployee.add(management);
        listOfEmployee.add(dailyStaff);
        employeeManagement.setListOfEmployee(listOfEmployee);


    }
}
