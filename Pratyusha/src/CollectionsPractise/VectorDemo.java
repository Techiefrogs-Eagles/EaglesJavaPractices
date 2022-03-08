package CollectionsPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arobj = new ArrayList<Integer>();
        arobj.add(10);
        arobj.add(20);
        arobj.add(30);
        arobj.add(40);
        arobj.add(50);

        //Vector<String> Vec = new Vector<>();
        //Vector<String> Vec = new Vector<>(5);
       // Vector<String> Vec = new Vector<>(10,20);
      // Vector<Integer> Vec1 = new Vector<>(arobj);*/


       Vector<String> Vec = new Vector<>(10);
       Vec.add("Hello");
       Vec.add("All");
       Vec.add("Welcome");
       Vec.add("To");
       Vec.add("Team");
      //System.out.println(Vec.size()+" "+Vec.capacity());
      Vector<String> Vec1 = new Vector<>(10);
      Vec1.add("Namastey");
      Vec1.add("I am Nemo");
      Vec1.add("Welcome");
      Vec1.add("To");
      Vec1.add("The class");

      Vec.addAll(Vec1);
       Vec.addElement("Good Morning");
      Vec.clear();
      System.out.println(Vec.contains("To"));
      System.out.println(Vec.containsAll(Vec1));
      System.out.println(Vec.elementAt(2));
        Vec.ensureCapacity(20);
        System.out.println(Vec.capacity());
        System.out.println(Vec.equals(Vec1));
       System.out.println(Vec1.firstElement());
       for(String str : Vec)
        {
            System.out.print(str+" ");
        }
         System.out.println(Vec.get(3));
        System.out.println(Vec.indexOf("Hello"));
        System.out.println(Vec.indexOf("H", 0));
         Vec.insertElementAt("GoodBye", 2);
        System.out.println(Vec.isEmpty());
        Iterator<String> str = Vec.iterator();
        while(str.hasNext())
        {
           System.out.print(str.next()+" ");
        }
        System.out.println(Vec1.lastElement());
        System.out.println(Vec.lastIndexOf("Team"));

       /* ListIterator<String> str = Vec.listIterator();
        while(str.hasNext())
        {
           System.out.print(str.next()+" ");
        }*/
        System.out.println(Vec.remove("Hello"));
        System.out.println(Vec1.removeAll(Vec));
       System.out.println(Vec1.removeElement("Team"));
        Vec.removeAllElements();
        Vec1.removeElementAt(2);
         Collections.replaceAll(Vec, "Team", "Group");
         Vec.retainAll(Vec1);
         System.out.println(Vec.set(1, "Nemo"));
         Vec1.setElementAt("Welcome", 0);
         System.out.println(Vec1);
         Vec.setSize(20);
         Vec.size();
         Collections.sort(Vec);
         System.out.println(Vec.subList(0, 2));
         System.out.println(Vec1.toArray());
         Vec.trimToSize();

         System.out.println(arobj.toString());


      System.out.println(Vec);

               
    }
}
