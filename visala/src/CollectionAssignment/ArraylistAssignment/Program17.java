package src.CollectionAssignment.ArraylistAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Program17 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
          Collections.sort(colour);
        ArrayList<String> colour1=new ArrayList<String>();
        colour1.add("red");
        colour1.add("White");
        colour1.add("blue");
        colour1.add("pink");
         Collections.sort(colour1);
      System.out.println(colour.equals(colour1));
    }


   /* ArrayList<String> colour=new ArrayList<String>();
    colour.add("red");
    colour.add("pink");
    colour.add("blue");
    colour.add("green");
    Collections.sort(colour);
    ArrayList<String> colour1=new ArrayList<String>();
    colour1.add("red");
    colour1.add("green");
    colour1.add("blue");
    colour1.add("pink");
    Collections.sort(colour1);
  System.out.println(colour.equals(colour1));
}*/



}
