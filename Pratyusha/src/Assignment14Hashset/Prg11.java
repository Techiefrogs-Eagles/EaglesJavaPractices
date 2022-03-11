package Assignment14Hashset;

import java.util.HashSet;

public class Prg11 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(200);
        set1.add(300);

        set1.retainAll(set);
       

        System.out.println(set);
        
        
    }
}
