package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg14 
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

      obj.clear();

        for (String str : obj)
        {
            System.out.println(str);
        }
    }
}
