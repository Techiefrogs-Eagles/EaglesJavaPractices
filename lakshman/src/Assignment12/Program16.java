package Assignment12;

import java.util.Collections;
import java.util.LinkedList;

public class Program16 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");

        Collections.shuffle(obj);

        for (String string : obj) 
        {
            System.out.println(string);
        }
    }
}
