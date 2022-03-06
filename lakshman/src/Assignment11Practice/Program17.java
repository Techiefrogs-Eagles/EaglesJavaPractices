package Assignment11Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Program17 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add("Yellow");
        Collections.sort(colour);

        ArrayList<String> colour1 = new ArrayList<String>();
        colour1.add("Green");
        colour1.add("Orange");
        colour1.add("Blue");
        colour1.add("Red");
        colour1.add("Yellow");
        Collections.sort(colour1);

        System.out.println(colour.equals(colour1));

    }
}
