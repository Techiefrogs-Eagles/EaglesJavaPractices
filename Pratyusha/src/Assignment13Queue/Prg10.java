package Assignment13Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prg10 
{
    public static void main(String[] args)
    {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Hello");
        obj.add("I am ");
        obj.add("Nemo");

        
        PriorityQueue<String> obj1 = new PriorityQueue<>(obj);
        for (String str : obj1)
        {
            System.out.println(str);
        }
    }
    
}
