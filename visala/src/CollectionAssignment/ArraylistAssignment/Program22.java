package src.CollectionAssignment.ArraylistAssignment;

import java.util.ArrayList;

public class Program22 {
    public static void main(String[] args) 
    {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add("Yellow");

        for (int i = 0; i < colour.size(); i++) {
            System.out.println(colour.get(i));
        }
    }
}

