package Practice.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericNonGen {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrli=new ArrayList<>();//Generic arraylist
        //arrli.add("qw");
        //arrli.add("e");
        arrli.add(123);
        arrli.add(12);
        arrli.add(1);
        Iterator itr=arrli.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(arrli.get(2));
        arrli.set(1, 4);
        for(Integer a:arrli){
            System.out.println(a);
        }
       
    } 
}
