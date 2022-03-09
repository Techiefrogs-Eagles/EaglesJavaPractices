package src.CollectionAssignment.ArraylistAssignment;

import java.util.ArrayList;

public class Program16 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");

        ArrayList<String> colour1=new ArrayList<String>();
        colour1.addAll(colour);
        for (String string : colour1) {
           System.out.println(string);
        }
    }
}
