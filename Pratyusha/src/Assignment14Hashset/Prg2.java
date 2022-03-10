package Assignment14Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Prg2 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
