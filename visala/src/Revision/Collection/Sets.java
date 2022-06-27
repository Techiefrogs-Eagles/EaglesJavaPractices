package src.Revision.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        // Hashset
        HashSet<String> obj = new HashSet<String>();
        System.out.println(obj.isEmpty());
        obj.add("Lakshmi");
        obj.add("Nandigam");
        if (obj.isEmpty()) {
            System.out.println("Hashset is emty");
        } else {
            System.out.println(obj.size());
        }
        if (obj.contains("Nandigam")) {
            obj.remove("Nandigam");

        }
        System.out.println(obj.size());
        obj.clear();
        System.out.println(obj.isEmpty());
        obj.add("Apple");
        obj.add("Bannana");
        obj.add("Custerdapple");
        obj.add("DragonFruit");
        // System.out.println(obj);
        /*
         * for (String string : obj) {
         * System.out.println("Hi " + string);
         * }
         */
        Iterator<String> itr = obj.iterator();
        {
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

        }

        // Linkedhashset
        LinkedHashSet<String> obj1 = new LinkedHashSet<>();
        obj1.add("A");
        obj1.add("B");
        obj1.add("C");
        obj1.add("D");
        Iterator<String> itr1 = obj1.iterator();
        {
            while (itr1.hasNext()) {
                System.out.println(itr1.next());
            }

        }
        Spliterator<String> str = obj.spliterator();
        {
            str.forEachRemaining(i -> System.out.println(i));
        }
        System.out.println("Treeset");
        TreeSet<String> obj2 = new TreeSet<>();
        obj2.add("One");
        obj2.add("Two");
        obj2.add("Three");
        obj2.add("Four");
        obj2.add("Five");
        System.out.println(obj2);
        System.out.println(obj2.ceiling("Five"));
        System.out.println(obj2.floor("Six"));
        System.out.println(obj2.higher("One"));
        System.out.println(obj2.lower("One"));
        System.out.println(obj2.first());
        System.out.println(obj2.last());
        System.out.println(obj2.pollFirst());
        System.out.println(obj2.pollLast());

    }
}
