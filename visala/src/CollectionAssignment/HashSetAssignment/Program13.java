package src.CollectionAssignment.HashSetAssignment;

import java.util.HashSet;

public class Program13 {
    public static void main(String[] args) {
        //Array to hash set
        String[] sarr={"A","B","C"};

        HashSet<String> H=new HashSet<>();
       for (int i = 0; i < sarr.length; i++) {
           H.add(sarr[i]);
       }
        System.out.println(H);
    

        //HashSet to array
      Object[] S=H.toArray();
       for (Object object : S) 
       {
          System.out.println(object);
        }
    }
}
