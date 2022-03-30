package exercise.abstraction;

import java.util.Scanner;

public abstract class Employee {

    private String employeeName;
    private  String datOfBirth;
    private  String address;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDatOfBirth() {
        return datOfBirth;
    }

    public void setDatOfBirth(String datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract int calcSalary();

    public void inputData(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập Thông tin của nhân viên: \n");
        System.out.println("Nhập Tên của Nhân Viên \n");
        employeeName=sc.nextLine();
        System.out.println("Nhập ngày thắng năm sinh : \n");
        datOfBirth=sc.nextLine();
        System.out.println("Nhập địa chỉ của nhân viên : ");
        address=sc.nextLine();

    }

    public void display() {
        System.out.println("Thông tin của nhân viên: \n");
        System.out.println("Tên của nhân viên: "+employeeName);
        System.out.println("Ngày tháng năm sinh: "+datOfBirth);
        System.out.println("Nhập địa chỉ của nhân viên: "+address);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", datOfBirth='" + datOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
