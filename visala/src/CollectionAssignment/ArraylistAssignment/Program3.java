package src.CollectionAssignment.ArraylistAssignment;

import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        colour.add(1,"white");
        for (String string : colour) {
            
          System.out.println(string);
        }
    }
}
