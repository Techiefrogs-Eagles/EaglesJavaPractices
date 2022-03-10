package Assignment14Hashset;

import java.util.HashSet;

public class Prg10 
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
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        set1.add(500);
        
        if(set.size()==set1.size())
        {
            set.retainAll(set1);
            if(set.isEmpty())
            {
                System.out.println("The given Hashsets are not equal");
            }
            else
            {
                System.out.println("The given Hashsets are equal");
            {

            }
        }
    }
}
}
