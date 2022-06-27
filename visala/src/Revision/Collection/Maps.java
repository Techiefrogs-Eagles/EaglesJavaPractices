package src.Revision.Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        // HashMap
        System.out.println(".........HASHMAP......");
        HashMap<String, String> hobj = new HashMap<String, String>();
        System.out.println(hobj.isEmpty());
        hobj.put("FS", "Telugu");
        hobj.put("SS", "English");
        hobj.put("TS", "Maths");
        System.out.println(hobj.size());
        System.out.println(hobj.containsKey("SS"));
        System.out.println(hobj.get("FS"));
        System.out.println(hobj.keySet());
        System.out.println(hobj.values());
        System.out.println(hobj.entrySet());
        System.out.println(hobj.putIfAbsent("FS", "Social"));
        hobj.forEach((a, b) -> System.out.println(a + "..... " + b));
        System.out.println(hobj.getOrDefault("FS1", "Telugu1"));
        System.out.println(hobj.merge("FS", "Subject", (a, b) -> a + b));
        hobj.replace("FS", "TeluguSubject", "Telugu");
        System.out.println(hobj);
        hobj.compute("FS", (a, b) -> b + "Subject");
        System.out.println(hobj);
        hobj.computeIfPresent("SS", (a, b) -> b + "Subject");
        System.out.println(hobj);
        hobj.computeIfAbsent("TS", (a) -> "Subject");
        System.out.println(hobj);
        System.out.println(".....TREEMAP.......");
        // TREEMAP
        TreeMap<Integer, String> tobj = new TreeMap<Integer, String>();
        tobj.put(1, "Telugu");
        tobj.put(2, "English");
        tobj.put(3, "Maths");

        System.out.println(tobj.ceilingEntry(3));
        System.out.println(tobj.ceilingKey(1));
        TreeMap<Integer, String> tobj1 = (TreeMap<Integer, String>) tobj.clone();
        System.out.println(tobj1);
        System.out.println(tobj.navigableKeySet());
        System.out.println(tobj.descendingKeySet());
        System.out.println(tobj.descendingMap());
        System.out.println(tobj.firstEntry());
        System.out.println(tobj.lastEntry());
        System.out.println(tobj.floorEntry(2));
        System.out.println(tobj.floorKey(3));
        System.out.println(tobj.keySet());
        System.out.println(tobj.headMap(3));
        System.out.println(tobj.higherEntry(2));
        System.out.println(tobj.lowerEntry(2));
        System.out.println(tobj.higherEntry(2));
        System.out.println(tobj.pollFirstEntry());
        System.out.println(tobj.subMap(1, 4));
        System.out.println(tobj.tailMap(3));
        System.out.println(tobj);
        System.out.println(".......LINKEDHASHMAP..........");
        // LINKEDHASHMAP
        LinkedHashMap<Integer, String> lobj = new LinkedHashMap<>();
        lobj.put(1, "Telugu");
        lobj.put(2, "English");
        lobj.put(3, "Maths");
        for (Map.Entry M : lobj.entrySet()) {
            System.out.println(M.getKey() + "  " + M.getValue());
        }
        System.out.println(lobj.get(2));
        System.out.println(lobj.values());
        System.out.println(lobj.entrySet());
        System.out.println(lobj);

        System.out.println("......HASHTABLE.....");
        // HASHTABLE
        Hashtable<String, String> htobj = new Hashtable<>();
        htobj.put("FS", "Telugu");
        htobj.put("SS", "English");
        htobj.put("TS", "Maths");

        for (Map.Entry M1 : htobj.entrySet()) {
            System.out.println(M1.getKey() + "...." + M1.getValue());
        }
        System.out.println(htobj.merge("FS", "Language", (a, b) -> a + " " + b));
        System.out.println(htobj);
    }
}
