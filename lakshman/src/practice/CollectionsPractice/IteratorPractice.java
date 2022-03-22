package practice.CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        Iterator<Integer> itr = obj.iterator();
        itr.forEachRemaining(i -> System.out.print(i+" "));

        Iterator<Integer> itr2 = obj.iterator();
        while(itr2.hasNext()) {
            
        }
    }
}
