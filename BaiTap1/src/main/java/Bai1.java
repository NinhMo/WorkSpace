import java.util.Scanner;

public class Bai1 {
    public int areaRectangle(int a, int b) {
        return a * b;
    }
    public int perimeterRectangle(int a, int b){
       return (a + b) * 2;
    }
    public double areaCircle(int a){
        return Math.pow(a, 2) * 4.13;
    }
    public double perimeterCircle(int a){
        return 2*Math.PI*a;
    }
    public double areaTriangle(double a, double h) {
        System.out.println(a+"======="+h);
        System.out.println(0.5*a*h);
        return (0.5*(a*h));
    }
    public int perimeterTriangle(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int width;
        int lenght;
        int radius;
        int sideA;
        int sideB;
        int sideC;
        Bai1 TestDrive = new Bai1();
        Scanner sr = new Scanner(System.in);
        System.out.println("=====Calculator Shape Progarmer=====");
        System.out.println("Please input side width of Rectangle:");
        width = sr.nextInt();
        System.out.println("Please input leghth of Recatangle: ");
        lenght = sr.nextInt();
        System.out.println("Please input radius of Circle: ");
        radius = sr.nextInt();
        System.out.println("Please input side A of Triangle: ");
        sideA = sr.nextInt();
        System.out.println("Please input side B of Triangle: ");
        sideB = sr.nextInt();
        System.out.println("Please input side C of Triangle: ");
        sideC = sr.nextInt();
        System.out.println("=====Rectangle=====");
        System.out.println("Width: " + width);
        System.out.println("Length: " + lenght);
        System.out.println("Area: "+ TestDrive.areaRectangle(width,lenght));
        System.out.println("Perimeter Rectangle: "+ TestDrive.perimeterRectangle(width,lenght));
        System.out.println("=====Circle=====");
        System.out.println("Radius: " + radius);
        System.out.println("Area: "+ TestDrive.areaCircle(radius));
        System.out.println("Perimeter: "+ TestDrive.perimeterCircle(radius));
        System.out.println("=====Triangle=====");
        System.out.println("Side A : " + sideA);
        System.out.println("Side B : " + sideB);
        System.out.println("Side C : " + sideC);
        System.out.println("Area: "+ TestDrive.areaTriangle(sideA,sideB));
        System.out.println("Perimeter: "+ TestDrive.perimeterTriangle(sideA,sideB,sideC));
    }
}
