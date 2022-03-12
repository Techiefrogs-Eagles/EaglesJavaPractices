import java.util.TreeMap;

public class TreeMapdemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"Tinku");
        map.put(2,"Tinni");
        map.put(3,"Mootu");
        map.put(4,"Pathulu");
        map.put(5,"Power Rangers");
        map.put(6,"Pokemon");
        map.put(7,"Ben10");
        TreeMap<Integer,String> map2 = (TreeMap<Integer,String>)map.clone();

         //System.out.println(map2);

       /*  System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Power Rangers"));

        System.out.println(map.containsValue("Akbar"));

        */
        
        System.out.println(map2.size());
        System.out.println(map.size());
        
        


       //System.out.println(map.ceilingEntry(3));
       
       //System.out.println(map.ceilingEntry(4));

       //System.out.println(map.ceilingKey(1));

       
       // System.out.println(map.descendingKeySet());
        //System.out.println(map.values());
        //System.out.println(map.descendingMap());
        //System.out.println(map.firstEntry());
        //System.out.println(map.lastEntry());
        /*System.out.println(map.floorEntry(2));
        System.out.println(map.floorKey(1));
        map.forEach((a,b)->System.out.println(a+"  "+b));*/


        /*System.out.println(map.navigableKeySet());

        System.out.println(map.pollLastEntry());

        System.out.println(map.pollFirstEntry());
        
        //System.out.println(map.firstEntry());*/


        /* System.out.println(map.headMap(6));
        
       System.out.println(map.headMap(6, false));

        System.out.println(map.higherEntry(4));

        System.out.println(map.lowerEntry(3));

        System.out.println(map.higherKey(3));

        
        System.out.println(map.lowerKey(3));


        System.out.println(map.keySet());*/



       /* System.out.println(map.tailMap(0));
        System.out.println(map.tailMap(3, false));
        */
    
       //map.clear();

       // System.out.println(map2);


       // System.out.println(map);
    }
}
