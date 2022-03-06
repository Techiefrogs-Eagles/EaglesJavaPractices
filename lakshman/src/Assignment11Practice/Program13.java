package Assignment11Practice;

import java.util.ArrayList;

public class Program13 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add("Yellow");

        colour.set(1, "Brown");

        for (String string : colour) 
        {
            System.out.println(string);
        }
    }
}
