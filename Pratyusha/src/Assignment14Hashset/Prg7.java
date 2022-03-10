package Assignment14Hashset;

import java.util.HashSet;

public class Prg7 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
          set.add(10);
          set.add(20);
          set.add(30);
          set.add(40);
          set.add(50);

          Object arr[] = set.toArray();
          for(Object ob : arr)
          {
              System.out.println(ob);
          }
    }
}
