import java.util.Hashtable;

public interface HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(0,"Prawin");
        hashtable.put(1,"Rathod");
        hashtable.put(5,"parasuram");
        hashtable.put(3,"Saikiran");
        hashtable.put(4,"saiKumar");
        hashtable.put(2,"Singh");
        hashtable.put(6,"Tom cruise");

        //hashtable.clear();

        Hashtable<Integer,String> hashtable1=(Hashtable<Integer,String>)hashtable.clone();
        //System.out.println(hashtable1);

        /*System.out.println("The Output is");
        System.out.println(hashtable.compute(3, (a,b)->b+"Sai"));*/
        

       //System.out.println(hashtable.computeIfAbsent(5, (a)->"Saikumar"));

     //  System.out.println(hashtable.computeIfPresent(0, (a,b)->b+" pudi"));

     // System.out.println(hashtable.elements()); //Enumerator element
     Hashtable<Integer,String> hashtable2=new Hashtable<>();
    
    /* hashtable2.put(1,"Hash");
     hashtable2.put(2,"Treemap");
     hashtable2.put(3,"Vectorlist");
     hashtable2.put(4,"Collections");
    */
/*
        hashtable1.put(0,"Prawin");
        hashtable1.put(1,"Rathod");
        hashtable1.put(5,"parasuram");
        hashtable1.put(3,"Saikiran");
        hashtable1.put(4,"saiKumar");
        hashtable1.put(2,"Singh");
        hashtable1.put(6,"Tom cruise");

     
     
     if(hashtable.equals(hashtable1))
     {
      System.out.println("Equal");
     }
     else{
         System.out.println("Not equal");
       System.out.println(hashtable.entrySet());

     }
     */
/*
     hashtable.forEach((a,b)->System.out.println(a+"....."+b));

      System.out.println(hashtable.getOrDefault(1, "Rathode"));

     System.out.println(hashtable.hashCode());

     System.out.println(hashtable.keySet());

    System.out.println(hashtable.merge(5, "Tom cruise", (a,b)->a+" "+b));

*/

      //System.out.println(hashtable.get(2));

     hashtable.remove(4);

       System.out.println(hashtable.size());
        
        
        //System.out.println(hashtable);
        
    }
}
