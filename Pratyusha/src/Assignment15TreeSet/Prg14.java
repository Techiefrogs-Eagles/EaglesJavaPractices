package Assignment15TreeSet;

import java.util.TreeSet;

public class Prg14 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        System.out.println(set.pollFirst());
        
    }
}
