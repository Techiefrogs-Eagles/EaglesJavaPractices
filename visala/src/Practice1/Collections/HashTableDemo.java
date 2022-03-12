package src.Practice1.Collections;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> HT=new Hashtable<>();
        HT.put(1,"Apple");
        HT.put(2,"Banana");
        HT.put(3,"CusterdApple");
        HT.put(4,"DragonFruit");
     

       // HT.clear();

      //  Hashtable<Integer,String> HT1=(Hashtable<Integer,String>)HT.clone();
      //   System.out.println(HT1);


      //System.out.println(HT.compute(1, (a,b)->b+"Fruit"));

      // System.out.println(HT.computeIfAbsent(5, (a)->"Fruits"));

      // System.out.println(HT.computeIfPresent(4, (a,b)->b+"DragonFruit"));

     // System.out.println(HT.elements());

     //  System.out.println(HT.entrySet());


     /*  Hashtable<Integer,String> HT1=new Hashtable<>();
       HT1.put(1,"Apple");
       HT1.put(2,"Banana");
       HT1.put(3,"CusterdApple");
       HT1.put(4,"DragonFruit");
       
       if(HT.equals(HT1))
       {
        System.out.println("Equal");
       }
       else{
           System.out.println("Not equal");
       }*/
     
       
      //  HT.forEach((a,b)->System.out.println(a+"....."+b));

       //  System.out.println(HT.getOrDefault(1, "Fruits"));

       // System.out.println(HT.hashCode());

       // System.out.println(HT.keySet());

      // System.out.println(HT.merge(1, "Fruit", (a,b)->a+" "+b));

     /*   Hashtable<Integer,String> HT1=new Hashtable<>();
         HT1.put(5,"Dragonfruit");
         HT1.put(6,"Fruits");
         HT1.putAll(HT);
         System.out.println(HT1);*/

        // System.out.println(HT.putIfAbsent(5,"Fruits" ));

       //HT.remove(1);

       //HT.replace(1, "Apple", "Fruits");

      // HT.replace(1, "Fruits");
       
     // HT.replaceAll((a,b)->"...."+b);

        
       /*  String str=HT.toString();
          System.out.println(str);*/

       //System.out.println(HT.values());

      // System.out.println(HT.contains("Apple"));


     //  System.out.println(HT.containsValue("Fruit"));



     //  System.out.println(HT.containsKey(1));

     /*if(HT.isEmpty())
       {
         System.out.println("Empty");
       }
      else{
         System.out.println("Not Empty");
      }*/
        
     // System.out.println(HT.get(1));

     //HT.remove(2);

       System.out.println(HT.size());
         

        System.out.println(HT);
       
    }
}
