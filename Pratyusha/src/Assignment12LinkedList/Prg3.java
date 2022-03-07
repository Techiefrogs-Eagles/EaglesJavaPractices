package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg3
{
    public static void main(String[] args) 
    {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        obj.addLast("I am a Small Fish");

       //int start = 3;
       for (int i = 2; i <obj.size(); i++) 
       {
        System.out.println(obj.get(i));
       }
       
        }
    
}
