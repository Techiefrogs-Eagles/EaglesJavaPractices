package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg15 
{
    public static void main(String[] args) 
    {
    LinkedList<String> Colour = new LinkedList<String>();
        Colour.add("Namaste");
        Colour.add("I am");
        Colour.add("A small");
        Colour.add("Fish");
        Colour.add("Nemo");

        String temp = Colour.get(3);
        Colour.set(2, Colour.get(4));
        Colour.set(3, temp);

        for(String str : Colour)
        {
            System.out.println(str);
        }

    }
}
