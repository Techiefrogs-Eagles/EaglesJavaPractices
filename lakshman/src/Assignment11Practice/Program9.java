package Assignment11Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Program9 {
    public static void main(String[] args) 
    {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add(0,"Yellow");
        
        Collections.shuffle(colour);

        for (String string : colour) 
        {
            System.out.println(string);
        }
    }
}
