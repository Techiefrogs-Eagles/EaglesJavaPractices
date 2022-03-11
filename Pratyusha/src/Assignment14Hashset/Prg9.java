package Assignment14Hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Prg9 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
          set.add(10);
          set.add(20);
          set.add(30);
          set.add(40);
          set.add(50);

          set.add(60);
          ArrayList<Integer> arr = new ArrayList<>(set);
          System.out.println(arr);
    }
    
}
