package Assignment12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program23 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");

        ArrayList<String> obj2 = new ArrayList<>(obj);

        for (String string : obj2) 
        {
            System.out.println(string);
        }
    }
}
