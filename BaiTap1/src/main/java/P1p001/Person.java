package P1p001;

import java.util.Scanner;

public class Person {
    int i;
    public int calcTotal(int bills[] ){
        int total = 0;
        for (i =0; i<bills.length; i++){
            total=total+bills[i];
        }
        return total;
    }
    public boolean payMoney(int total, int wallet){
        if (wallet >= total){
          return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Person person = new Person();
        int number;
        int wallet, total;
        Scanner sr = new Scanner(System.in);
        System.out.println("======Shopping program=======");
        System.out.println("input number of bill: ");
        number=sr.nextInt();
        int bills[] = new int[number];
        for (int i = 0; i<number; i++ ){
            System.out.println("input value of bill "+(i+1)+":");
            int array=sr.nextInt();
            bills[i]=array;
        }
        System.out.println("input value of wallet: ");
        wallet=sr.nextInt();
        total=person.calcTotal(bills);
        if(person.payMoney(total, wallet)==true){
            System.out.println("this is total of bill: "+total);
            System.out.println("you can buy it");
        }
        else {
            System.out.println("this is total of bill: "+total);
            System.out.println("you can't buy it");
        }








    }
}
