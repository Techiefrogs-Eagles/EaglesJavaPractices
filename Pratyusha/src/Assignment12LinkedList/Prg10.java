package Assignment12LinkedList;

import java.util.LinkedList;

public class Prg10 
{
    public static void main(String[] args) 
    {
            LinkedList<String> obj = new LinkedList<>();
            obj.add("Hello");
            obj.add("I am ");
            obj.add("Nemo");
    
            LinkedList<String> obj1 = new LinkedList<>();
            obj1.add(obj.peekFirst());
            obj1.add(obj.peekLast());

            for (String str : obj1)
            {
                System.out.println(str);
            }
    }
}
