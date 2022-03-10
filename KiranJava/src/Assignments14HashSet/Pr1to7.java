package Assignments14HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Pr1to7 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
   
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
          //Program2
          Iterator<String> p = h_set.iterator();
  
            while (p.hasNext()) {
            System.out.println(p.next());
            }
        //program3
        System.out.println(h_set.size());
        //program4
            //h_set.clear();
            //h_set.removeAll(h_set);
        //program5
        System.out.println(h_set.isEmpty());
        //Program5
        HashSet<Integer> hs=new HashSet<>();
        hs=(HashSet<Integer>) h_set.clone();
        System.out.println(hs);
        //Program7
        String[] new_array = new String[h_set.size()];
      h_set.toArray(new_array);
      for(String element : new_array){
        System.out.println(element);
     }

    }
}
