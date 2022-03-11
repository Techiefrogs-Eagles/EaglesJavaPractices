package src.Practice1.Collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;


public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> T=new TreeSet<>();
        T.add("Ant");
        T.add("Cat");
        T.add("Dog");
        T.add("Bear");
        T.add("Elephant");
        
        TreeSet<String> T1=new TreeSet<>();
        T1.add("Fox");
        T1.add("Goat");

        T.addAll(T1);
        System.out.println("Ceiling="+T.ceiling("C"));     //largest element

        Iterator<String> itr=T.descendingIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

          System.out.println(T.descendingSet());

          System.out.println(T.floor("C"));                    //Smallest element

          System.out.println(T.headSet("Ca"));                 

          System.out.println(T.headSet("D", true));

          System.out.println("Higher = "+T.higher("E"));

          Iterator<String> itr1=T.iterator();
          while(itr1.hasNext())
          {
              System.out.println(itr1.next());
          }

          System.out.println("Lower = "+T.lower("G"));


          System.out.println("Poll First= "+T.pollFirst());


          System.out.println("Poll Last = "+T.pollLast());


         Spliterator<String> S=T.spliterator();
         S.forEachRemaining(i->System.out.println(i));



         System.out.println(T.subSet("C", "E"));


         System.out.println(T.tailSet("D"));

         System.out.println(T.tailSet("E", true));

         System.out.println(T.contains("Bear"));

        
         System.out.println( T.isEmpty());

         System.out.println(T.remove("Cat"));

       /*  T.clear();
         System.out.println(T);*/

  
         TreeSet<String> T2=(TreeSet<String>)T.clone();
         System.out.println(T2);

         System.out.println("First = "+T.first());

         System.out.println("LAst = "+T.last());

         System.out.println("Size = "+T.size());




        

        }

}
