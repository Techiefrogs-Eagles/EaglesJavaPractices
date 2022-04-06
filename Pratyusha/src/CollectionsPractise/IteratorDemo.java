package CollectionsPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Character> ch = new ArrayList<>();
        ch.add('A');
        ch.add('B');
        ch.add('C');
        ch.add('D');

        Iterator<Character> itr = ch.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }

}
