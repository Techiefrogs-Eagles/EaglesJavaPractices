package Assignment12;

import java.util.LinkedList;

public class program19 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");

        System.out.println("removed first element"+"     "+obj.pollFirst());

        for (String string : obj) 
        {
            System.out.println(string);
        }
    }
}
