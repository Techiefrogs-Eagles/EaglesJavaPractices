package src.ArraylistAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Program8 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        Collections.sort(colour);
        for (String string : colour) {
            
            System.out.println(string);
        }
        System.out.println();
        Collections.reverse(colour);
        for (String string : colour) {
            
            System.out.println(string);
        }
    }
}
