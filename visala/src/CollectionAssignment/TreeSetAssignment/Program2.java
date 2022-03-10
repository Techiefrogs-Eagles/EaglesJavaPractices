package src.CollectionAssignment.TreeSetAssignment;

import java.util.Iterator;
import java.util.TreeSet;

public class Program2 {
    public static void main(String[] args) {
        TreeSet<String> T=new TreeSet<>();
        T.add("Ant");
        T.add("Cat");
        T.add("Dog");
        T.add("Bear");
        T.add("Elephant");
        Iterator<String> itr1=T.iterator();
          while(itr1.hasNext())
          {
              System.out.println(itr1.next());
          }
    }
}
