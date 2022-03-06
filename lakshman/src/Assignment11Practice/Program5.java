package Assignment11Practice;

import java.util.ArrayList;

public class Program5 {
    public static void main(String[] args) 
    {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add(0,"Yellow");
        colour.set(1, "White");

        for (String string : colour) 
        {
            System.out.println(string);
        }
    }
}
