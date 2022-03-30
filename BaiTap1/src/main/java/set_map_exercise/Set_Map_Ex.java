package set_map_exercise;

import java.util.*;

public class Set_Map_Ex {

    public int sumScore(HashSet<Integer> list){
        int sum=0;
        Iterator<Integer> element =list.iterator();
        while (element.hasNext()){
            sum = sum+element.next();
        }

        return sum;
    }

    public int highScore(HashSet<Integer> list){
        int high=0;
        Iterator<Integer> element =list.iterator();
        while (element.hasNext()){
          if(high<element.next()){
              high=element.next();
          }
        }

        return high;
    }

    public static Set<String> removeShortWord(Set<String> listWords, int minLength){
        for (String element:listWords){
            if (element.length()<=minLength){
                listWords.remove(element);
            }
        }
        return listWords;

    }

    public static void main(String[] args) {
        Set_Map_Ex setMap=new Set_Map_Ex();
        HashSet<Integer> list = new HashSet<>();
        Set<String> listWords = new HashSet<>();
        Set<String> newListWords;
        int numberLine;
        int minLength;
        String word;

        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tu: ");
        numberLine=sc.nextInt();
        System.out.print("Nhap do dai nho nhat cua Word: ");
        minLength= sc.nextInt();
        sc.nextLine();
        for (int i=0; i<numberLine; i++) {
            System.out.print(" Nhap tu so " +(i+1)+":");
            word = sc.nextLine();
            listWords.add(word);
        }
        newListWords =removeShortWord(listWords,minLength);
        for (String element: newListWords){
            System.out.print(element+" ");
        }

        System.out.println("\n Tong la : "+setMap.sumScore(list));
        System.out.println("Gia tri lon nhat la : "+setMap.highScore(list));
    }


}
