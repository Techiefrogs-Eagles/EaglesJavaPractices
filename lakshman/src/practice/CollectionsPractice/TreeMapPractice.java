package practice.CollectionsPractice;

//import java.util.Map;
//import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) 
    {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1, "Akhil");
        map.put(2, "Sravani");
        map.put(3, "Rohini");
        map.put(4, "Tataji");
        map.put(5, "Priyanka");
        map.put(6, "Sandeep");

        /*TreeMap<Integer,String> map1 = (TreeMap<Integer,String>)map.clone();
        System.out.println(map1);*/

        //System.out.println(map.ceilingEntry(2));
        //System.out.println(map.ceilingKey(2));
        //map.clear();
        //System.out.println(map.descendingKeySet());
        //System.out.println(map.descendingMap());
        //System.out.println(map.firstEntry());
        //System.out.println(map.lastEntry());
        //System.out.println(map.floorEntry(2));
        //System.out.println(map.floorKey(2));
        //map.forEach((a,b)->System.out.println(a+"  "+b));
        /*for (Map.Entry<Integer,String> obj: map.entrySet()) {
            System.out.println(obj.getKey()+"  "+obj.getValue());
        }*/
        //System.out.println(map.headMap(4));
        //System.out.println(map.headMap(4, true));
        //System.out.println(map.higherEntry(3));
        //System.out.println(map.higherKey(3));
        //System.err.println(map.lowerEntry(3));
        //System.out.println(map.lowerKey(3));
        //System.out.println(map.keySet());
        //System.out.println(map.navigableKeySet());
        //System.out.println(map.pollFirstEntry());
        //System.out.println(map.pollLastEntry());
        //map.putAll(map1);
        //map.replace(3, "R.Rohini");
        //map.replace(3, "Rohini", "R.Rohini");
        //map.replaceAll((a,b)->a+"..."+b);
        //System.err.println(map.subMap(1, 4));
        //System.out.println(map.subMap(1, false, 4, true));
        //System.out.println(map.tailMap(3));
        //System.out.println(map.tailMap(3, true));
        //System.out.println(map.containsKey(5));
        //System.out.println(map.containsValue("Rohini"));
        //System.out.println(map.firstKey());
        //System.out.println(map.lastKey());
        //map.remove(3);
        //System.out.println(map.entrySet());
        //System.out.println(map.size());
        //System.out.println(map.values());
        System.out.println(map);

    }
}
