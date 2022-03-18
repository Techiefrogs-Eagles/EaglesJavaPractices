package src.Practice1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(10);
        A.add(20);
        A.add(30);
        A.add(40);
        Iterator<Integer> itr=A.iterator();
       /* while(itr.hasNext())
        {
            System.out.println(itr.next());
        }*/

       // itr.forEachRemaining(a->System.out.println(a));

     
        int i = 0;
        while (itr.hasNext()) {
           i = (int) itr.next();
           if (i==30) {
              itr.remove();
              System.out.println(A);
              break;   
           }
        }
    }
}
