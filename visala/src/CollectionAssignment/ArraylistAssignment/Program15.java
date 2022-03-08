package src.CollectionAssignment.ArraylistAssignment;

import java.util.ArrayList;

public class Program15 {
    public static void main(String[] args) {
       /* ArrayList<String> colour=new ArrayList<String>();
        if(colour.isEmpty())
        {
            System.out.println("Arraylist is emty");
        }
        else 
        {
            System.out.println("arrylist is not emty");
        }*/
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        colour.set(0,"White");
        if(colour.isEmpty())
        {
            System.out.println("Arraylist is emty");
        }
        else 
        {
            System.out.println("Arraylist not emty");
        }
    }
}
