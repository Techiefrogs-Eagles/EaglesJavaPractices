package Assignment11Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add("Yellow");

        Iterator<String> itr = colour.iterator();
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
    }
}
