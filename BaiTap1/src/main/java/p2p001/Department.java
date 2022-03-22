package p2p001;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private List<Employee> listOfEmployee = new ArrayList<>();

    public List<Employee> getListOfEmployee(){
        return listOfEmployee;
    }

    public void setListOfEmployee(List<Employee> listOfEmployee){
        this.listOfEmployee=listOfEmployee;
    }

    public void setListOfEmployee(Employee employee){
        this.listOfEmployee.add(employee);
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String display() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", listOfEmployee=" + listOfEmployee +
                '}';
    }

    public static void main(String[] args) {
    Employee hourlyEmployee = new HourlyEmployee();
    Employee SalariedEmployee = new SalariedEmployee();

    hourlyEmployee.setSsn("ID1");
    hourlyEmployee.setFirstName("Ninh");
    hourlyEmployee.setLastName("Mo");
    hourlyEmployee.setBirthDate("1992/12/13");
    hourlyEmployee.setPhone("098767632");
    hourlyEmployee.setEmail("ninhmo@gmail.com");

    SalariedEmployee.setSsn("ID2");
    SalariedEmployee.setFirstName("Nguyen");
    SalariedEmployee.setLastName("Van");
    SalariedEmployee.setBirthDate("1999/12/3");
    SalariedEmployee.setPhone("0957647821");
    SalariedEmployee.setEmail("nguyenvan@gmail.com");

    Department department = new Department();
    department.setDepartmentName("ABCD");

    List<Employee> employees = new ArrayList<>();
    employees.add(hourlyEmployee);
    employees.add(SalariedEmployee);

    department.setListOfEmployee(employees);

        System.out.println(department.display());


    }




}

