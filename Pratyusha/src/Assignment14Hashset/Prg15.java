package Assignment14Hashset;

import java.util.HashSet;

public class Prg15 
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
        set1.add(20);
        set1.add(30);

        set.retainAll(set1);

        HashSet<Integer> set2 = new HashSet<>(set);

        System.out.println(set2);


        
        
        
    }
}
