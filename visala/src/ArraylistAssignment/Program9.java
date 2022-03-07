package src.ArraylistAssignment;

import java.util.ArrayList;
import java.util.Collections;


public class Program9 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        colour.set(0,"White");
    
        for (String string : colour) {
            System.out.println(string);
        }
        Collections.shuffle(colour);
        System.out.println();
        for (String string : colour) {
            System.out.println(string);
        }
    }
    
}
