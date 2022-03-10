package CollectionsPractise;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Iterator;

public class DequeDemo 
{
    public static void main(String[] args) 
   {
     //Deque<String> dd = new ArrayDeque<String>();
    /* dd.add("Rabbit");
     dd.add("Pegion");
     dd.add("Cat");
     dd.add("Puppy");*/

     Deque<String> DD = new ArrayDeque<String>();
     DD.add("Lab");
     DD.add("Husky");
     DD.add("Pomerian");
       //dd.addAll(dd1);

     //dd.addFirst("German Shepard");
    //dd.addLast("Golden Retriver");
    // System.out.println(dd.contains("Puppy"));
    /*Iterator<String> str = dd.descendingIterator();
    while(str.hasNext())
    {
       System.out.print(str.next()+" ");
    }
    System.out.println(); */

     //System.out.println(DD.element());
     //System.out.println(DD.getFirst());
     //System.out.println(DD.getLast());

    /* Iterator<String> str = DD.iterator();
        while(str.hasNext())
        {
           System.out.print(str.next()+" ");
        }
        System.out.println();*/
        //System.out.println(DD.offer("Golden Retriver"));
       // System.out.println(DD.offerFirst("Saint Bernard"));
        //System.out.println(DD.offerLast("Saint Bernard"));
          //System.out.println(DD.peek());
         // System.out.println(DD.peekFirst());
        //  System.out.println(DD.peekLast());
          // DD.poll();
          // DD.pollFirst();
         //  DD.pollLast();

            //DD.pop();
           // DD.push("PocketPuppy");
          // DD.remove();
         //DD.remove("Husky");
        //DD.removeFirst();
       //DD.removeFirstOccurrence("Husky");
      // DD.removeLast();
     //DD.removeLastOccurrence("Lab");
     DD.size();

     for(String str1 : DD)
     {
         System.out.println(str1);
     }

   }
}
