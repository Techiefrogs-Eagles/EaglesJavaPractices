package practice.CollectionsPractice;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueuePractice {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> obj = new ConcurrentLinkedQueue<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        /*ConcurrentLinkedQueue<Integer> obj1 = new ConcurrentLinkedQueue<>();
        obj1.addAll(obj);*/

        //System.out.println(obj.contains(2));

        /*for (Integer integer : obj) {
            System.out.println(integer);
        }*/

        //System.out.println(obj.isEmpty());

        /*Iterator<Integer> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        //obj.offer(6);

        //obj.remove(1);

        //obj.removeAll(obj);

        //System.out.println(obj.retainAll(obj));

        //System.out.println(obj.size());

        /*Spliterator<Integer> str = obj.spliterator();
        while (str.tryAdvance((k) -> System.out.print(k+" ")));*/

        /*Object arr[] = obj.toArray();
        for (Object object : arr) {
            System.out.print(object+" ");
        }
        System.out.println();*/


        System.out.println(obj);
    }
}
