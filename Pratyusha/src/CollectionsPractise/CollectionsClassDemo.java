package CollectionsPractise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
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
import java.util.TreeSet;

public class CollectionsClassDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('A');
        arr.add('B');
        arr.add('C');
        arr.add('D');
        arr.add('E');
        
       // Collections.addAll(arr , 'F','G','H');
       // System.out.println(arr);
       
       /* Deque<String> d = new ArrayDeque<String>(5);  
        d.add("Royal Enfield");  
        d.add("Aprilia");  
        d.add("Apachi");  
        d.add("Duke");          
        Queue<String> q = Collections.asLifoQueue(d);     
        System.out.println(q);  */

       // System.out.println(Collections.binarySearch(arr, 'C'));

      // System.out.println(Collections.checkedCollection(arr, Character.class));

      //System.out.println(Collections.checkedList(arr, Character.class));

     /* HashMap<Character,String> hmap = new HashMap<>();
       hmap.put('A', "Apple");
       hmap.put('B', "Banana");
       hmap.put('C', "CusturdApple");
       hmap.put('D', "Dragon Fruit");
       System.out.println(Collections.checkedMap(hmap, Character.class, String.class));*/

      /* NavigableMap<Character,Integer> hmap1 = new TreeMap<>();
       hmap1.put('A', 10);
       hmap1.put('B', 20);
       hmap1.put('C', 30);
       hmap1.put('D', 40);
       hmap1.put('E', 50);
      System.out.println(Collections.checkedNavigableMap(hmap1, Character.class, Integer.class));*/

     /* NavigableSet<Integer> nset = new TreeSet<>();
      nset.add(1);
      nset.add(2);
      nset.add(3);
      nset.add(4);
      nset.add(5);
      System.out.println(Collections.checkedNavigableSet(nset, Integer.class));*/

     /* Queue<String> q = new PriorityQueue<>();
      q.add("Ant");
      q.add("Bat");
      q.add("Cow");
      q.add("Dog");
      System.out.println(Collections.checkedQueue(q, String.class));*/

     /* HashSet<Integer> hset = new HashSet<>();
      hset.add(50);
      hset.add(60);
      hset.add(70);
      System.out.println(Collections.checkedSet(hset, Integer.class));*/

     /* SortedMap<Character,String> smap = new TreeMap<>();
      smap.put('K', "Kiwi");
      smap.put('L', "Lichi");
      smap.put('M', "Mulberry");
      System.out.println(Collections.checkedSortedMap(smap, Character.class, String.class));*/
      
     /* SortedSet<Integer> Sset = new TreeSet<>();
      Sset.add(100);
      Sset.add(200);
      Sset.add(300);
      System.out.println(Collections.checkedSortedSet(Sset, Integer.class)); */

     /* ArrayList<Character> arr1 = new ArrayList<>();  //Returns true is there are no common elements in both the lists
      arr1.add('E');                                 //And returns false is there are any common lists
      arr1.add('F');
      arr1.add('G');
      System.out.println(Collections.disjoint(arr, arr1));*/

     /* Enumeration<String> enu = Collections.emptyEnumeration();
      
      while(enu.hasMoreElements())
      {
          System.out.println(enu.nextElement());
      }
      System.out.println("Enumeration list is empty");*/

    /* Iterator<String> itr = Collections.emptyIterator();
     while(itr.hasNext())
     {
        System.out.print(itr.next()+" ");
     }
         System.out.println();*/

    /* List<Integer> L = Collections.emptyList();
     System.out.println("Empty List is: " + L); */

    /* ListIterator<String> Litr = Collections.emptyListIterator();
     System.out.println("Empty List Iterator is:" + Litr.hasNext()); */

    /* Map<String,Integer> M = Collections.emptyMap();
     System.out.println("Empty Map is: " + M); */

    /* NavigableMap<String,String> nmap = Collections.emptyNavigableMap();
     //nmap.put("A","B");
     System.out.println(nmap); */

    /* NavigableSet<Integer> h = Collections.emptyNavigableSet();
     System.out.println(h);*/

    // System.out.println(Collections.emptySet());

   /* SortedMap<Integer,String> smap = Collections.emptySortedMap();
    System.out.println("Empty Sorted map is:" + smap);*/

   /* SortedSet<String> sset = Collections.emptySortedSet();
     // sset.add("Hello");
    System.out.println(sset); */

   /* Enumeration<Character> enum1 = Collections.enumeration(arr);
     while (enum1.hasMoreElements())
     {
         System.out.print(enum1.nextElement());
     }
       System.out.println(); */

      /*Collections.fill(arr, 'Z');
      System.out.println(arr);*/

   // System.out.println(Collections.frequency(arr, 'C'));

  /* ArrayList<Character> arr1 = new ArrayList<>();
       arr1.add('C');
       arr1.add('D');
       arr1.add('E');
  // System.out.println(Collections.indexOfSubList(arr, arr1));
   System.out.println(Collections.lastIndexOfSubList(arr, arr1)); */

     /* ArrayList<Character> v = new ArrayList<Character>();

     Enumeration<Character> enum2 = Collections.enumeration(arr);
      v = Collections.list(enum2);
      System.out.println(v); */

    //  System.out.println(Collections.max(arr));  //returns the highest value

    // System.out.println(Collections.min(arr));   //returns the least value

      /*   List<Character> ch = Collections.nCopies(5, 'J');
             System.out.println(ch); */

      /*  Map<String,Boolean> M1 = new HashMap<>();
        Set<String> S = Collections.newSetFromMap(M1);
    
        S.add("Java");  
        S.add("C++");
        S.add("Ruby");

        System.err.println(S);
        System.out.println(M1); */

      /*  Collections.replaceAll(arr, 'C', 'W');
        System.err.println(arr); */

      /*  Collections.reverse(arr);
        System.out.println(arr); */

      /*  Collections.sort(arr , Collections.reverseOrder());
         System.out.println(arr); */

       /* Collections.rotate(arr, 'B');
        System.out.println(arr); */

      /*  Collections.shuffle(arr);
        System.out.println(arr); */

      /*  Set<String> S1 = Collections.singleton("Good Morning");
         System.err.println(S1);  */

       /*  List<Integer> L1 = Collections.singletonList(2);
         System.out.println(L1); */

       /*  Map<Integer, Integer> map = Collections.singletonMap(1, 5);  
         System.out.println(map);  */

       /*  Collections.sort(arr);
        System.out.println(arr); */

     /* Collections.synchronizedCollection(arr);
      System.out.println(arr); */

    /*  Collections.synchronizedList(arr);
      System.out.println(arr); */

     /* Map<Character,Integer> M3 = new HashMap<>();
      M3.put('A', 10);
      M3.put('B', 20);
      M3.put('C',30);
      Map<Character,Integer>  synmap = Collections.synchronizedMap(M3);
      System.out.println(synmap); */

     /* NavigableMap<Integer,String> Nmap = new TreeMap<Integer, String>();  
      Nmap.put(3, "KFC");  
      Nmap.put(4, "Mcdonals");  
      Nmap.put(2, "BugerKing");  
      Nmap.put(1, "Dominos");  
      Map<Integer, String> synmap = Collections.synchronizedNavigableMap(Nmap);  
      System.out.println(synmap); */

    /*  NavigableSet<String> Nset = new TreeSet<>();  
      Nset.add("Twitter");  
      Nset.add("Instagram");  
      Nset.add("Facebook");  
      Nset.add("Watsapp");  
      Set<String> synset = Collections.synchronizedNavigableSet(Nset);  
      System.out.println(synset);   */

     /* Set<Character> Ch = new TreeSet<>();
      Ch.add('G');
      Ch.add('H');
      Ch.add('I');
       Collections.synchronizedSet(Ch);
       System.out.println(Ch); */

     /*  SortedMap<Integer, String> map = new TreeMap<Integer, String>();  
       map.put(1, "FrenchFries");  
       map.put(4, "Pizza");  
       map.put(3, "Burger");  
       map.put(2, "Momos");  
        Collections.synchronizedSortedMap(map);  
       System.out.println(map);  */

     /*  SortedSet<String> set5 = new TreeSet<String>();  
       set5.add("Lamb");  
       set5.add("Kitten");  
       set5.add("Bunny");  
       set5.add("Cub");
        Collections.synchronizedSortedSet(set5);  
       System.out.println(set5);  */

      /* Collection<String> c = new ArrayList<>();  
        c.add("Visakhapatnam");
        c.add("Rajahmundry");
        c.add("Vijaywada");
        c.add("Hyderabad");
       Collection<String> c2 =  Collections.unmodifiableCollection(c);   
        System.out.println(c2);
         c.add("Guntur");    
         System.out.println(c2); */
        
       /*List<String> str = new ArrayList<>();
       str.add("noodles");
       str.add("panipuri");
       str.add("Cutlet");
       Collection<String> str1 = Collections.unmodifiableList(str);
       System.out.println(str1);
       str.add("PapadChat");
       System.out.println(str1); */

     /*  Map<Character,Integer> map2 = new HashMap<>();
       map2.put('A', 1);
       map2.put('B', 2);
       map2.put('C',3);
       Map<Character,Integer> map3 = Collections.unmodifiableMap(map2);
       System.out.println(map3);
       map2.put('Z', 10);
       System.out.println(map3); */

      /* NavigableMap<Integer,String> map = new TreeMap<Integer,String>();  
       map.put(1, "Divya");  
       map.put(2, "Pratyusha");  
       map.put(3, "Reddy");  
       NavigableMap<Integer,String> map2 = Collections.unmodifiableNavigableMap(map);  
       System.out.println("Unmodifiable Navigable Map: " + map2);         
       map.put(4, "Smylee");  
       System.out.println(map2);  */

     /*   NavigableSet<Integer> set = new TreeSet<>();  
       Collections.addAll(set, 1,2,3,4,5);  
       NavigableSet<Integer> set2 = Collections.unmodifiableNavigableSet(set);  
       System.out.println(set2);  
       set.add(15);  
       System.out.println(set2);  */

      /* Set<Integer> set = new TreeSet<>();  
       Collections.addAll(set, 1,2,3,4,5);  
       Set<Integer> set2 = Collections.unmodifiableSet(set);  
       System.out.println(set2); 
       set.add(15);  
       System.out.println(set2);  */

     /*  SortedMap<String, Integer> map = new TreeMap<String, Integer>();  
        map.put("Ten", 10);  
        map.put("Twenty", 20);  
        map.put("Thirty", 30);  
        map.put("Fourty", 40);  
        SortedMap<String, Integer> map2 = Collections.unmodifiableSortedMap(map);  
         map.put("Fifty", 50);  
        System.out.println(map2);  */

        SortedSet<Integer> set = new TreeSet<Integer>();  
        set.add(1000);  
        set.add(2000);  
        set.add(3000);  
        set.add(4000);   
        SortedSet<Integer> set2 = Collections.unmodifiableSortedSet(set);  
        System.out.println(set2);  
        set.add(6000);  
        System.out.println(set2);  


        















 






    
   







     
     

     
     

      


    }
}
