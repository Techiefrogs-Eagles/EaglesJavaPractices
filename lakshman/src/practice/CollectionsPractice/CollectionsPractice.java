package practice.CollectionsPractice;

/*import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;*/

public class CollectionsPractice 
{
    public static void main(String[] args) 
    {
        /*List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(100);
        arr.add(5);
        arr.add(-5);
        
        //Collections.addAll(arr , 6,80,20);
        //System.out.println(arr);
       
        /*Deque<String> dobj = new ArrayDeque<String>(5);  
        dobj.add("Hello");  
        dobj.add("Team");  
        dobj.add("Good");  
        dobj.add("Morning");          
        Queue<String> qobj = Collections.asLifoQueue(dobj);     
        System.out.println(qobj);*/  

        //System.out.println(Collections.binarySearch(arr, -5, Collections.reverseOrder()));

        //System.out.println(Collections.checkedCollection(arr, Integer.class));

        //System.out.println(Collections.checkedList(arr, Integer.class));

        /*HashMap<Character,String> hobj = new HashMap<>();
        hobj.put('A', "Apple");
        hobj.put('B', "Ball");
        hobj.put('C', "Cat");
        hobj.put('D', "Dog");
        System.out.println(Collections.checkedMap(hobj, Character.class, String.class));*/

        /*NavigableMap<Character,Integer> hobj1 = new TreeMap<>();
        hobj1.put('A', 10);
        hobj1.put('B', 20);
        hobj1.put('C', 30);
        hobj1.put('D', 40);
        hobj1.put('E', 50);
        System.out.println(Collections.checkedNavigableMap(hobj1, Character.class, Integer.class));*/

        /*NavigableSet<Integer> nobj = new TreeSet<>();
        nobj.add(1);
        nobj.add(2);
        nobj.add(3);
        nobj.add(4);
        nobj.add(5);
        System.out.println(Collections.checkedNavigableSet(nobj, Integer.class));*/

        /*Queue<String> qobj1 = new PriorityQueue<>();
        qobj1.add("Apple");
        qobj1.add("Ball");
        qobj1.add("Cat");
        qobj1.add("Dog");
        System.out.println(Collections.checkedQueue(qobj1, String.class));*/

        /*HashSet<Integer> hobj2 = new HashSet<>();
        hobj2.add(10);
        hobj2.add(20);
        hobj2.add(30);
        System.out.println(Collections.checkedSet(hobj2, Integer.class));*/

        /*SortedMap<Integer,String> sobj = new TreeMap<>();
        sobj.put(1, "One");
        sobj.put(2, "Two");
        sobj.put(3, "Three");
        System.out.println(Collections.checkedSortedMap(sobj, Integer.class, String.class));*/
      
        /*SortedSet<Integer> sobj2 = new TreeSet<>();
        sobj2.add(1);
        sobj2.add(2);
        sobj2.add(3);
        System.out.println(Collections.checkedSortedSet(sobj2, Integer.class));*/

        /*ArrayList<Integer> arr1 = new ArrayList<>();  //Returns true is there are no common elements in both the lists
        arr1.add(50);                                 //And returns false is there are any common lists
        arr1.add(60);
        arr1.add(70);
        arr1.add(80);
        arr1.add(90);
        Collections.copy(arr1, arr);
        System.out.println(arr1);
        System.out.println(Collections.disjoint(arr, arr1));*/

        /*Enumeration<String> enm = Collections.emptyEnumeration();
        while(enm.hasMoreElements())
        {
            System.out.println(enm.nextElement());
        }*/

        /*Iterator<Integer> itr = Collections.emptyIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        /*List<String> list = Collections.emptyList();
        System.out.println(list);*/

        /*ListIterator<Integer> lobj = Collections.emptyListIterator();
        while (lobj.hasNext()) {
            System.out.println(lobj.next());
        }*/

        /*Map<Integer,String> mobj = Collections.emptyMap();
        System.out.println(mobj);*/

        /*NavigableSet<Integer> nobj12 = Collections.emptyNavigableSet();
        System.out.println(nobj12);*/

        /*Set<Integer> nobj13 = Collections.emptySet();
        System.out.println(nobj13);*/

        /*SortedMap<Integer,String> nobj14 = Collections.emptySortedMap();
        System.out.println(nobj14);*/

        /*SortedSet<Integer,String> nobj15 = Collections.emptySortedSet();
        System.out.println(nobj15);*/

        /*Enumeration<Integer> enumeration = Collections.enumeration(arr);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        arr = Collections.list(enumeration);*/

        /*Collections.fill(arr, 1000);
        System.out.println(arr);*/

        //System.out.println(Collections.frequency(arr, 1));
        
        /*List<Integer> arr1 = new ArrayList<>();
        arr1.add(100);
        arr1.add(5);
        System.out.println(Collections.indexOfSubList(arr, arr1));
        System.out.println(Collections.lastIndexOfSubList(arr, arr1));*/

        /*System.out.println(Collections.max(arr));
        System.out.println(Collections.min(arr));*/

        /*List<String> list = Collections.nCopies(3, "Hello");  
        System.out.println(list);*/
        
        /*Map<String,Boolean> obj = new TreeMap<>();
        Set<String> users = Collections.newSetFromMap(obj);
        users.add("hai");
        users.add("hello");
        users.add("good");
        users.add("morning");

        obj.put("lakshman", false);

        System.out.println(users);
        System.out.println(obj);*/

        /*Collections.replaceAll(arr, 1, 10000);
        System.out.println(arr);*/
        
        /*Collections.reverse(arr);
        System.out.println(arr);*/

        /*Collections.sort(arr , Collections.reverseOrder());
        System.out.println(arr);*/

        /*Collections.rotate(arr, 2);
        System.out.println(arr);*/

        /*Collections.shuffle(arr);
        System.out.println(arr);*/

        /*Set<String> obj = Collections.singleton("hello");
        System.out.println(obj);*/

        /*List<Integer> obj = Collections.singletonList(1);
        System.out.println(obj);*/

        /*Map<String,Integer> obj = Collections.singletonMap("laskhman", 1);
        System.out.println(obj);*/

        /*Collections.sort(arr);
        System.out.println(arr);*/

        /*Collections.swap(arr, 3, 5);
        System.out.println(arr);*/

        /*Collection<Integer> obj = Collections.synchronizedCollection(arr);
        System.out.println(obj);*/

        /*List<Integer> obj = Collections.synchronizedList(arr);
        System.out.println(obj);*/

        /*Map<String,Integer> obj1 = new TreeMap<>();
        obj1.put("lakshman", 1);
        obj1.put("bhaskar", 2);
        obj1.put("varma", 3);
        Map<String,Integer> obj = Collections.synchronizedMap(obj1);
        System.out.println(obj);*/

        /*NavigableMap<String,Integer> obj1 = new TreeMap<>();
        obj1.put("lakshman", 1);
        obj1.put("bhaskar", 2);
        obj1.put("varma", 3);
        NavigableMap<String,Integer> obj = Collections.synchronizedNavigableMap(obj1);
        System.out.println(obj);*/

        /*Set<Integer> obj1 = new HashSet<>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        Set<Integer> obj = Collections.synchronizedSet(obj1);
        System.out.println(obj);*/

        /*SortedMap<Integer,String> obj1 = new TreeMap<>();
        obj1.put(1,"lakshman");
        obj1.put(2,"venkat");
        obj1.put(3,"varma");
        Map<Integer,String> obj = Collections.synchronizedSortedMap(obj1);
        System.out.println(obj);*/

        /*SortedSet<Integer> obj1 = new TreeSet<>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        SortedSet<Integer> obj = Collections.synchronizedSortedSet(obj1);
        System.out.println(obj);*/

        /*Collection<String> c = new ArrayList<>();  
        Collections.addAll(c, "lakshman", "varma", "bhaskar");  
        Collection<String> c2 = Collections.unmodifiableCollection(c);  
        System.out.println(c2);  
        c.add("venkat");  
        System.out.println(c2);*/

        /*List<Integer> obj = new ArrayList<>();
        Collections.addAll(obj, 1,2,3,4,5,5,6);
        List<Integer> obj1 = Collections.unmodifiableList(obj);
        System.out.println(obj1);
        obj.add(7);
        System.out.println(obj1);*/

        /*Map<Integer,String> obj = new HashMap<>();
        obj.put(1,"lakshman");
        obj.put(2,"venkat");
        obj.put(3,"varma");
        Map<Integer,String> obj1 = Collections.unmodifiableMap(obj);
        System.out.println(obj1);
        obj.put(7,"siva");
        System.out.println(obj1);*/

        /*NavigableMap<String,Integer> obj1 = new TreeMap<>();
        obj1.put("lakshman", 1);
        obj1.put("bhaskar", 2);
        obj1.put("varma", 3);
        NavigableMap<String,Integer> obj = Collections.synchronizedNavigableMap(obj1);
        System.out.println(obj);
        obj1.put("venkat", 4);
        System.out.println(obj);*/

        /*NavigableSet<String> obj1 = new TreeSet<>();
        obj1.add("lakshman");
        obj1.add("bhaskar");
        NavigableSet<String> obj = Collections.unmodifiableNavigableSet(obj1);
        System.out.println(obj);
        obj1.add("varma");
        System.out.println(obj);*/

        /*Set<Integer> obj1 = new HashSet<>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        Set<Integer> obj = Collections.unmodifiableSet(obj1);
        System.out.println(obj);
        obj1.add(4);
        System.out.println(obj);*/

        /*SortedMap<String,Integer> obj1 = new TreeMap<>();
        obj1.put("lakshman", 1);
        obj1.put("bhaskar", 2);
        obj1.put("varma", 3);
        SortedMap<String,Integer> obj = Collections.unmodifiableSortedMap(obj1);
        System.out.println(obj);
        obj1.put("venkat", 4);
        System.out.println(obj);*/

        /*SortedSet<Integer> obj1 = new TreeSet<>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        Set<Integer> obj = Collections.unmodifiableSortedSet(obj1);
        System.out.println(obj);
        obj1.add(4);
        System.out.println(obj);*/

        




    }
}

