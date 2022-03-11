package CollectionsPractise;

import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args) 
    {
        TreeMap<Integer,String> tree = new TreeMap<>();
        tree.put(1, "Mulberry");
        tree.put(2, "Lychee");
        tree.put(3, "Apricot");
        tree.put(4, "Kiwi");
        tree.put(5, "Strawberry");

      /*  TreeMap<Integer,String> T1 = (TreeMap<Integer, String>) tree.clone();
        System.out.println(T1);*/
       // System.out.println(tree.ceilingEntry(4));
       // System.out.println(tree.ceilingKey(5));
      //  tree.clear();
          //System.out.println(tree.descendingKeySet());
         // System.out.println(tree.descendingMap());
         //System.out.println(tree.firstEntry());
         //System.out.println(tree.lastEntry());
        // System.out.println(tree.floorEntry(3));
        // System.out.println(tree.floorKey(3));
        // tree.forEach((a,b) ->System.out.println(a+"...."+b));
        /*for (Map.Entry<Integer,String> obj: map.entrySet()) {
            System.out.println(obj.getKey()+"  "+obj.getValue());
        }*/
        //System.out.println(tree.headMap(1));
        //System.out.println(tree.headMap(3, true));
        //System.out.println(tree.higherEntry(2));
        //System.out.println(tree.higherKey(1));
        //System.err.println(tree.lowerEntry(2));
        //System.out.println(tree.lowerKey(3));
        //System.out.println(tree.keySet());
        //System.out.println(tree.navigableKeySet());
        //System.out.println(tree.pollFirstEntry());
        //System.out.println(tree.pollLastEntry());
        //tree.putAll(T1);
        //tree.replace(3, "Cherry");
        //tree.replace(3, "Mango", "Raspberry");
        //tree.replaceAll((a,b)->a+"..."+b);
        //System.err.println(tree.subMap(1, 4));
        //System.out.println(tree.subMap(1, false, 4, true));
        //System.out.println(tree.tailMap(3));
        //System.out.println(tree.tailMap(3, true));
        //System.out.println(tree.containsKey(5));
        //System.out.println(tree.containsValue("Rohini"));
        //System.out.println(tree.firstKey());
        //System.out.println(tree.lastKey());
        //tree.remove(3);
        //System.out.println(tree.entrySet());
        //System.out.println(tree.size());
        //System.out.println(tree.values());
        System.out.println(tree);



    }
}
