package Assignments11;

import java.util.ArrayList;
import java.util.Collections;

public class Pr8to11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrli=new ArrayList<>();
        arrli.add(43);
        arrli.add(56);
        arrli.add(123);
        arrli.add(12);
        arrli.add(1);
        Collections.shuffle(arrli);
        Collections.sort(arrli);
        for(int i=0;i<arrli.size();i++)  
           {  
            System.out.println(arrli.get(i));     
           }
        Collections.reverse(arrli); 
         
        for(int i=0;i<arrli.size();i++)  
           {  
            System.out.println(arrli.get(i));     
           }
        Collections.swap(arrli, 0, 1);
        System.out.println(" swap of two elements");
        for(int i=0;i<arrli.size();i++)  
           {  
            System.out.println(arrli.get(i));     
           }
    }
}
