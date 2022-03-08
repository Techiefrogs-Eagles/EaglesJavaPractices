package src.ArraylistAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Program2 {
    public static void main(String[] args)
     {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        Iterator<String> Itr=colour.iterator();
       while(Itr.hasNext())
       {
           System.out.println(Itr.next());
       }
    }
}
