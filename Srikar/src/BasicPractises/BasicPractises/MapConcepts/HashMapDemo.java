import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map  =  new HashMap<>();
        map.put(1, "one");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Eight");
        map.put(5,"Srikar");
        map.put(6,"Eagles");
        map.put(7,"Batch");
        //System.out.println(map);

        // HashMap<Integer,String> map1 = (HashMap<Integer,String>)map.clone();
         //map1.putAll(map);


         //map.putIfAbsent(8, "2021");


        // map.remove(1);


        //map.remove(8,"2022");

       // map.replace(1, "9160143434");

        //map.replaceAll((a,b)->a-10+"--->"+b);//Desending order
        //map.replaceAll((a,b)->a+20+"--->"+b);//Ascending order

       // map.merge(5," Margapuri", (a,b)->a+b);
    
         /*System.out.println(map.keySet());

        System.out.println(map.values());
        
        System.out.println(map.entrySet());*/

        System.out.println(map.get(7));

        System.out.println(map.getOrDefault(10, "Here i not mentioned number 10 and value"));


        //System.out.println("hello "+map);


        //map.clear();  //


        map.computeIfPresent(3,(a,b)-> b+" Mr.");


        //map.computeIfAbsent(6, (a)->"T.Srikar");



        //System.out.println((map.containsKey(3)));

        /*if(map.isEmpty())
        {
            System.out.println("Is Empty");
        }
       else
        {
              System.out.println("Not Empty");
    }*/
    System.out.println( map );
}
}
