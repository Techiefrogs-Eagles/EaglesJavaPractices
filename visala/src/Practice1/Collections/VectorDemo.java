package src.Practice1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        /*Vector<String> V=new Vector<String>();
        System.out.println(V.size()+"  "+V.capacity());*/

        /*Vector<String> V=new Vector<String>(5);
        System.out.println(V.size()+"  "+V.capacity());*/

        /*Vector<String> V=new Vector<String>(5,10);
        System.out.println(V.size()+"  "+V.capacity());*/
        
      /*  ArrayList<String> colour=new ArrayList<String>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        
        Vector<String> V=new Vector<String>(colour);

        System.out.println(V.size()+"  "+V.capacity());*/
        Vector<String> V=new Vector<String>();
       
        V.add("A");
        V.add("B");
        V.add("C");
        V.add("D");
        V.add("E");
        V.add("F");

        Vector<String> V1=new Vector<String>();
       
        V1.add("AA");
        V1.add("BB");
        V1.add("CC");
        V1.add("DD");
        V1.add("EE");
        V1.add("FF");

        V.addAll(V1);

        V.addElement("G");

      //  V.clear();
      System.out.println(V.contains("G"));
      System.out.println(V.containsAll(V1));



       
       
        
       String sarr[]=new String[15];
       sarr[0]="a";
       sarr[1]="b";
       sarr[2]="c";
 
      /* V.copyInto(sarr);
       for (String string : sarr) {
         System.out.println(string);
       }*/
      
      // System.out.println( V.elementAt(3));

    /*  V.ensureCapacity(21);
      System.out.println(V.capacity());*/
       
     /*  if(V.equals(V1))
       {
         System.out.println("Vectors are equal");
       }
       else{
         System.out.println("Vectors are not equal");
       }*/
      System.out.println( V.firstElement());
      System.out.println(V.get(3));
      System.out.println(V.indexOf("B"));
      System.out.println(V.indexOf("E", 3));
      
      V.insertElementAt("M", 1);
      System.out.println(V);
   
      System.out.println(V.isEmpty());
    /*  Iterator<String> itr=V.iterator();
      while(itr.hasNext())
     {
         System.out.println(itr.next());
     }*/
     System.out.println(V.lastElement());
     System.out.println(V.lastIndexOf("G"));
    /* ListIterator<String> itr1=V.listIterator();
     while(itr1.hasNext())
     {
       System.out.println(itr1.next());
     }*/
     
  /*  V.remove(0);
    System.out.println(V);*/

   /* V.removeAll(V);
    System.out.println(V);*/

  /*  V.removeAllElements();
    System.out.println(V);*/

  /*  V.removeElement("A");
    System.out.println(V);*/

   /* V.removeElementAt(1);
    System.out.println(V);*/
   

   /* Collections.replaceAll(V, "A", "Z");
    System.out.println(V);*/

  /*V.retainAll(V1);
  System.out.println(V);*/

 /* V.set(0, "K");
  System.out.println(V);*/

 /* V.setElementAt("V", 5);
  System.out.println(V);*/

 /* V.setSize(20);
  System.out.println(V);*/

  /*Collections.sort(V);
  System.out.println(V);*/

 
  //System.out.println( V.subList(3, 5));


  /*V.trimToSize();
  System.out.println(V);*/

  //System.out.println(V.toArray());
  System.out.println(V.toString());




     
   
    }
}
