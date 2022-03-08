package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg20 
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");
     
        System.out.println("First element ="+obj.peekFirst()); 

        for (String string : obj) {
           System.out.println(string);
        }
         
     }
    
}
