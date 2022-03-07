package Assignment12LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Prg2 
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");
        
        
        Iterator<String> str = obj.iterator();
        while(str.hasNext())
        {
           System.out.print(str.next()+" ");
        }
        System.out.println();

    }
}
