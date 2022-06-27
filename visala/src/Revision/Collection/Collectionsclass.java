package src.Revision.Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Collectionsclass {
    public static void main(String[] args) {
        // addall
        ArrayList<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1, 1, 2, 3, 4);
        for (Integer integer : arr1) {
            System.out.println(integer);
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2, 1, 4, 5, 6);
        Collections.copy(arr1, arr2);
        System.out.println("Copy The elments" + arr1);
        System.out.println(Collections.disjoint(arr1, arr2));
        System.out.println("Emptylist" + Collections.emptyList());
        Iterator<Integer> itr1 = Collections.emptyListIterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("Not emty listiterator");

        // aslifoqueue
        Deque<Integer> d = new ArrayDeque<>();
        Collections.addAll(d, 10, 20, 30, 40);
        Queue<Integer> pobj = Collections.asLifoQueue(d);
        System.out.println(pobj);
        System.out.println(Collections.binarySearch(arr1, 2));
        Collections.sort(arr1);
        System.out.println(arr1);
        System.out.println(Collections.checkedCollection(pobj, Integer.class));
        System.out.println(Collections.checkedList(arr1, Integer.class));
        System.out.println(Collections.checkedQueue(pobj, Integer.class));

        Map<Integer, String> M = new HashMap<>();
        M.put(1, "A");
        M.put(2, "B");
        M.put(3, "C");
        M.put(4, "D");
        System.out.println(Collections.checkedMap(M, Integer.class, String.class));
        System.out.println("emptymap()" + Collections.emptyMap());

        SortedMap<Integer, String> SM = new TreeMap<>();
        SM.put(1, "A");
        SM.put(2, "B");
        SM.put(3, "C");
        SM.put(4, "D");
        System.out.println(Collections.checkedSortedMap(SM, Integer.class, String.class));
        System.out.println("Emptysortmap()" + Collections.emptySortedMap());

        SortedSet<String> SS = new TreeSet<>();
        Collections.addAll(SS, "I", "J", "K");
        System.out.println(Collections.checkedSortedSet(SS, String.class));
        System.out.println("Emptysortset()" + Collections.emptySortedSet());

        NavigableMap<Integer, String> NM = new TreeMap<>();
        NM.put(1, "A");
        NM.put(2, "B");
        NM.put(3, "C");
        NM.put(4, "D");
        System.out.println(Collections.checkedNavigableMap(NM, Integer.class, String.class));
        System.out.println("emptyNavigablemap" + Collections.emptyNavigableMap());

        NavigableSet<String> NS = new TreeSet<>();
        Collections.addAll(NS, "a", "b", "c");
        System.out.println(Collections.checkedNavigableSet(NS, String.class));
        System.out.println(Collections.checkedSet(NS, String.class));
        System.out.println("emptyNavigableset" + Collections.emptyNavigableSet());

        Enumeration<String> en = Collections.emptyEnumeration();
        while (en.hasMoreElements()) {
            en.nextElement();
            System.out.println("Emtyenumeration" + en);
        }
        System.out.println("Not emty enumeration");

        Iterator<Integer> itr = Collections.emptyIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("NOt emty iterator");

        Set<Integer> Sobj = new TreeSet<>();
        Collections.addAll(Sobj, 1, 2, 3, 4, 5);
        System.out.println(Sobj);
        System.out.println("Emptyset()" + Collections.emptySet());
    }

}
