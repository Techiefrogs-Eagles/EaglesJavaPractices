package src.ArraylistAssignment;

import java.util.ArrayList;

public class Program11 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        String temp=colour.get(1);
        colour.set(1,colour.get(2));
        colour.set(2,temp);
        for (String string : colour) {
            
            System.out.println(string);
        }

    }
}
