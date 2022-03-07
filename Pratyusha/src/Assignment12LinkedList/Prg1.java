package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg1 
{
    public static void main(String[] args)
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        obj.addLast("I am a Small Fish");

        for (String str : obj)
        {
            System.out.println(str);
        }


    }
}
