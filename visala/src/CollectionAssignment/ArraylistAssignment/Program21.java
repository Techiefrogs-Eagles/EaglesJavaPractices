package src.CollectionAssignment.ArraylistAssignment;

import java.util.ArrayList;

public class Program21 {
    public static void main(String[] args) 
    { 
        ArrayList<String> colour = new ArrayList<String>();

        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add("Yellow");

        ArrayList<String> colour1 = new ArrayList<String>();
        colour1.add("White");
        colour1.add("Pink");
        colour1.add("Black");
        colour1.add("Brown");

        colour.addAll(colour1);

        for (String string : colour) {
            System.out.println(string);
        }
    }
}

