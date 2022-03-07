package Assignment12LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Prg4 
{
    public static void main(String[] args) 
    {
    LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        obj.addLast("I am a Small Fish");

        Iterator<String> str = obj.descendingIterator();
        while(str.hasNext())
        {
           System.out.print(str.next()+" ");
        }
        System.out.println();

}
}
