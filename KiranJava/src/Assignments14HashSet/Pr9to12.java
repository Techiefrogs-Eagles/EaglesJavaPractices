package Assignments14HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Pr9to12 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
        ArrayList<String> list = new ArrayList<String>(h_set);
        System.out.println("ArrayList contains: "+ list);
        //program10
        HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("Red");
          h_set2.add("Pink");
          h_set2.add("Black");
          h_set2.add("Orange");
          for (String element : h_set){
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
         }  
         //program11
         h_set.retainAll(h_set2);
         System.out.println(h_set);
         //program12
         h_set2.clear();
    }
}
