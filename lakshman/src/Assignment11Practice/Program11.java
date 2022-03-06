package Assignment11Practice;

import java.util.ArrayList;

public class Program11 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add("Yellow");

        String temp = colour.get(2);
        colour.set(2, colour.get(3));
        colour.set(3, temp);

        for (String string : colour) 
        {
            System.out.println(string);
        }
    }
}
