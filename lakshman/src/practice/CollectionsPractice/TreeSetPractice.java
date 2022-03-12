package practice.CollectionsPractice;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<String> obj = new TreeSet<>();
        obj.add("lakshman");
        obj.add("bhaskar");
        obj.add("varma");
        obj.add("venkat");
        obj.add("sai");

        TreeSet<String> obj1 = new TreeSet<>();
        obj1.add("jithendra");

        obj.addAll(obj1);
        System.out.println(obj.ceiling("v"));

        Iterator<String> itr1 = obj.descendingIterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next()+" ");
        }
        System.out.println();

        System.out.println(obj.descendingSet());

        System.out.println(obj.floor("s"));

        System.out.println(obj.headSet("va"));

        System.out.println(obj.headSet("va",true));

        System.out.println(obj.higher("s"));

        Iterator<String> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

        System.out.println(obj.lower("s"));

        System.out.println(obj.pollFirst());

        //System.out.println(obj.pollLast());

        Spliterator<String> sobj = obj.spliterator();
        sobj.forEachRemaining(i->System.out.println(i));

        System.out.println(obj.subSet("a", "l")+"yes");

        System.out.println(obj.subSet("a", true, "l", true));

        System.out.println(obj.tailSet("b"));

        System.out.println(obj.tailSet("b", true));

        System.out.println(obj.contains("bhaskar"));

        System.out.println(obj.isEmpty());

        obj.remove("lakshman");

        //obj.clear();

        //TreeSet<String> tobj = (TreeSet<String>)obj.clone();

        System.out.println(obj.first());

        System.out.println(obj.last());

        System.out.println(obj.size());

    }
}
