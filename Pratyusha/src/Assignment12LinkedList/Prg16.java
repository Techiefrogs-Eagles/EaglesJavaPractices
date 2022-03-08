package Assignment12LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Prg16 
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        Collections.shuffle(obj);

        for (String str : obj)
        {
            System.out.println(str);
        }
    }
}
