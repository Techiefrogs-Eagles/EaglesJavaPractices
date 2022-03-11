package Practice.HashMaps;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> HM=new HashMap<>();
        HM.put(1,"Hi");
        HM.put(2,"Kiran");
        HM.put(3,"Good");
        HM.put(4,"Morning");
        HM.put(2, "EveryOne");
       // System.out.println(HM);


      // HM.clear();
       //System.out.println(HM);

       if(HM.isEmpty())
       {
           System.out.println("Is Empty");
       }
      else
       {
             System.out.println("Not Empty");
       
       }


       HashMap<Integer,String> HM1=(HashMap<Integer,String>)HM.clone();
       System.out.println(HM1);   

       System.out.println(HM.entrySet());

      System.out.println(HM.keySet());

        /* HashMap<Integer,String> HM1=new HashMap<>();
         HM1.putAll(HM);
          System.out.println(HM1);*/

         //  HM.putIfAbsent(5, "Good");
         // System.out.println(HM);

        /*  HM.remove(4);
          System.out.println(HM);*/

          /* HM.remove(3, "Good");
          System.out.println(HM);*/

          // System.out.println((HM.containsKey(4)));

        // System.out.println(HM.containsValue("Good"));

         // HM.forEach((a,b)->System.out.println(a+"..... "+b)) ;

         // System.out.println(HM.get(2));

          System.out.println(HM.getOrDefault(1, "Good"));

        //  System.out.println(HM.merge(5, "Hello",(a,b)->a+b));

        /* HM.replace(1, "Hi", "Hello");
           System.out.println(HM);*/


          // System.out.println(HM.size());


           //System.out.println(HM.values());
  
          /* HM.replaceAll((a,b)->a+1+"....."+b);
           System.out.println(HM);*/
  
  
  
           /*HM.compute(5, (a,b)-> b+"Hello");
           System.out.println(HM);*/
  
           HM.computeIfPresent(5, (a,b)-> b+"Hello");
           System.out.println(HM);
  
          /* HM.computeIfAbsent(5, (a)->"Hello");
           System.out.println(HM);*/
    }
}
