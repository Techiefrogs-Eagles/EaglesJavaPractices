package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg24 
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo fish");

        
        LinkedList<String> obj1 = new LinkedList<>();

        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        System.out.println(obj.equals(obj1));

        

        
    }
    
}
