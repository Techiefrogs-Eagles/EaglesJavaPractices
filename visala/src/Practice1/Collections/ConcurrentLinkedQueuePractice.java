package src.Practice1.Collections;

<<<<<<< HEAD
import java.util.Iterator;
import java.util.Spliterator;
=======
import java.util.concurrent.ConcurrentLinkedDeque;
>>>>>>> 2e407b985a3b11cdcbb931f9423b919672ca7363
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueuePractice {
    public static void main(String[] args) {
<<<<<<< HEAD
        ConcurrentLinkedQueue<Integer> CLQ = new ConcurrentLinkedQueue<>();
        CLQ.add(1);
        CLQ.add(2);
        CLQ.add(3);
        CLQ.add(4);
        CLQ.add(5);

        /*
         * ConcurrentLinkedQueue<Integer> CLQ1 = new ConcurrentLinkedQueue<>();
         * obj1.addAll(obj);
         */

        // System.out.println(CLQ.contains(2));

        /*
         * for (Integer integer : CLQ) {
         * System.out.println(integer);
         * }
         */

        // System.out.println(CLQ.isEmpty());

        /*
         * Iterator<Integer> itr = CLQ.iterator();
         * while (itr.hasNext()) {
         * System.out.println(itr.next());
         * }
         */

        // CLQ.offer(6);

        // CLQ.remove(1);

        // CLQ.removeAll(CLQ);

        // System.out.println(CLQ.retainAll(CLQ));

        // System.out.println(CLQ.size());

        /*
         * Spliterator<Integer> str = CLQ.spliterator();
         * while (str.tryAdvance((k) -> System.out.print(k+" ")));
         */

        /*
         * Object arr[] = CLQ.toArray();
         * for (Object object : arr) {
         * System.out.print(object+" ");
         * }
         * System.out.println();
         */

        System.out.println(CLQ);
    }
}
=======
        ConcurrentLinkedQueue<Integer> CLQ=new ConcurrentLinkedQueue<>();
        
    }
}
>>>>>>> 2e407b985a3b11cdcbb931f9423b919672ca7363
