package arraylist;

import java.util.*;

public class SumScores {

    public int sumCalculates(ArrayList<Integer> arraylist){
       int sum=0;
       for (Integer item:arraylist){
           sum+=item;
       }
       return sum;
    }
    public int getHighScore(ArrayList<Integer> arraylist){
        int highScore=0;
        int i;
        int size=arraylist.size();
        for (i=0; i<size; i++){
            if (highScore<arraylist.get(i)) {
                highScore = arraylist.get(i);

            }

        }   return highScore;

    }

    public static ArrayList<Integer> reverseScores(ArrayList<Integer> arraylist){
            Collections.reverse(arraylist);
            return arraylist;
        }

        public static ArrayList<String> removeDuplicates(ArrayList<String> values){
            ArrayList<String> newList=new ArrayList<>();

            for (String item:values){
                if (!newList.contains(item)){
                    newList.add(item);
                }

            }
            return newList;

        }

    public static void main(String[] args) {
        ArrayList<Integer> reverlist =new ArrayList<>();
        ArrayList<String>  removeDuplicates =new ArrayList<>();
        ArrayList<Integer> arraylist=new ArrayList<>();
        arraylist.add(1);
        arraylist.add(4);
        arraylist.add(7);
        arraylist.add(3);
        arraylist.add(6);

      ArrayList<String> value=new ArrayList<>();
        value.add("Ninh");
        value.add("Thi");
        value.add("Mo");
        value.add("Ninh");

        SumScores sumscore =new SumScores();
        int sum =sumscore.sumCalculates(arraylist);
        System.out.println("Tong cua mang la: "+sum);
       int highscore=sumscore.getHighScore(arraylist);
       System.out.println("So lon nhat trong mang la: "+highscore);
       reverlist=reverseScores(arraylist);
       for (Integer item:reverlist){
           System.out.print(item+" ");
       }
        System.out.println("\n");
        removeDuplicates=removeDuplicates(value);
       for (String item:removeDuplicates){
           System.out.println(item);
       }


    }
}
