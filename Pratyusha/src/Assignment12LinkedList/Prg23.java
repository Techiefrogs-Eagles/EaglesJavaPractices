package Assignment12LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Prg23 
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        ArrayList<String> obj1 = new ArrayList<>(obj);

        for (String str : obj1)
        {
            System.out.println(str);
        }
    }
    
}
