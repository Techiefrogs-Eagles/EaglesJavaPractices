package Assignment14Hashset;

import java.util.HashSet;

public class Prg5 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        if(set.isEmpty())
        {
            System.out.println("The Hashset is Empty");
        }
        else
        {
            System.out.println("The Hashset is not  Empty");
        }

    }
}
