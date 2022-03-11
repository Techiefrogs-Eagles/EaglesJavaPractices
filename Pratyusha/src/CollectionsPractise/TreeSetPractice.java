package CollectionsPractise;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<String> obj = new TreeSet<>();
        obj.add("Range Rover");
        obj.add("Jaguar");
        obj.add("Audi");
        obj.add("Skoda");
        obj.add("Morris Garage");

        TreeSet<String> obj1 = new TreeSet<>();
        obj1.add("Creta");

        obj.addAll(obj1);
        System.out.println(obj.ceiling("v"));

        Iterator<String> itr1 = obj.descendingIterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next()+" ");
        }
        System.out.println();

        System.out.println(obj.descendingSet());

        System.out.println(obj.floor("R"));

        System.out.println(obj.headSet("Sk"));

        System.out.println(obj.headSet("Au",true));

        System.out.println(obj.higher("R"));

        Iterator<String> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        System.out.println(obj.lower("R"));

        System.out.println(obj.pollFirst());

        System.out.println(obj.pollLast());

        Spliterator<String> sobj = obj.spliterator();
        sobj.forEachRemaining(i->System.out.println(i));

        System.out.println(obj.subSet("A", "S")+"yes");

        System.out.println(obj.subSet("A", true, "S", true));

        System.out.println(obj.tailSet("M"));

        System.out.println(obj.tailSet("A", true));

        System.out.println(obj.contains("Skoda"));

        System.out.println(obj.isEmpty());

        obj.remove("Audi");

       // obj.clear();

    
       // TreeSet<String> tobj = (TreeSet<String>)obj.clone();

        System.out.println(obj.first());

        System.out.println(obj.last());

        System.out.println(obj.size());

    }
}
