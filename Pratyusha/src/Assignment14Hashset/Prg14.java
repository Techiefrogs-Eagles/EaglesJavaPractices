package Assignment14Hashset;

import java.util.HashSet;

public class Prg14 
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
          set1.add(60);
          set1.add(70);

          set.addAll(set1);
          System.out.println(set);

    }
}
