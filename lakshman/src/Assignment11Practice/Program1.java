package Assignment11Practice;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add("Yellow");

        for (String string : colour) {
            System.out.println(string);
        }
    }
}
