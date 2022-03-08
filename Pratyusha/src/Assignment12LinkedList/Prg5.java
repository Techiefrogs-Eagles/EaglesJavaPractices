package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg5 
{
    public static void main(String[] args) 
    {

        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        obj.add(0, "Namaste");
        for (String string : obj) 
        {
            System.out.println(string);
        }
    }
}
