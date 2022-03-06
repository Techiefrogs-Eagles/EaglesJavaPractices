package Assignments11;

import java.util.ArrayList;

public class Pr12to17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrli=new ArrayList<>();
        arrli.add(43);
        arrli.add(56);
        arrli.add(123);
        arrli.add(12);
        arrli.add(1);
        System.out.println( arrli.subList(0, 3));
        arrli.set(2, 67);
        //arrli.clear();//using clear method
        //arrli.removeAll(arrli); //using removeall method
        System.out.println(arrli.isEmpty());
        arrli.add(0, 67);
        for(int i=0;i<arrli.size();i++)  
           {  
            System.out.println(arrli.get(i));     
           }
           ArrayList<Integer> arrli2=new ArrayList<>();
           arrli2.add(432);
           arrli2.add(561);
           arrli2.add(123);
           arrli2.add(12);
           arrli2.add(1);
           arrli2.addAll(arrli);
           System.out.println(" ");
           for(int i=0;i<arrli2.size();i++)  
           {  
            System.out.println(arrli2.get(i));     
           }
        //comparing two Lists
        System.out.println(arrli.equals(arrli2));
    }
}
