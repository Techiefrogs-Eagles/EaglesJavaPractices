package src.Revision.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> cobj = new ConcurrentHashMap<>();
        cobj.put(1, "Apple");
        cobj.put(2, "Bannana");
        cobj.put(3, "Custerdapple");
        cobj.put(4, "Draganfruit");
        // cobj.clear();

        System.out.println(cobj);
        System.out.println(cobj.compute(1, (a, b) -> a + "..." + b));
        cobj.computeIfPresent(4, (a, b) -> "Number");

        System.out.println(cobj);
        cobj.computeIfAbsent(3, a -> "Custerdapple");
        System.out.println(cobj);

    }
}
