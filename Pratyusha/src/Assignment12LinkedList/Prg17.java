package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg17
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");


        LinkedList<String> obj1 = new LinkedList<>();
        obj1.add("I am");
        obj1.add("A small");
        obj1.add("Fish");

        obj.addAll(obj1);

        for (String str : obj1)
        {
            System.out.println(str);
        }
    }
}
