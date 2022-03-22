package Practice.CollectionsPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
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
import java.util.Vector;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(-40);
        arr.add(50);
      ArrayList <Integer> arr1=new ArrayList<>();   //add the new elements and old elements.
        Collections.addAll(arr1, 10,30,-40);
        System.out.println(arr1);

    /*    Deque<String> D=new ArrayDeque<String>();
        D.add("Appale");
        D.add("Banana");
        D.add("CusterdApple");
        D.add("DragenFruit");
        Queue<String> Q=Collections.asLifoQueue(D);
        System.out.println(Q);*/


      //  System.out.pri   tln(Collections.binarySearch(arr, 20));

     //   System.out.println(Collections.checkedCollection(arr, Integer.class));


    //   System.out.println(Collections.checkedList(arr, Integer.class));


     /*  HashMap<Integer,String> HM=new HashMap<>();
         HM.put(1,"A");
         HM.put(2,"B");
         HM.put(3,"C");
         System.out.println((Collections.checkedMap(HM, Integer.class, String.class)));*/

     /*   NavigableMap<String,Integer> NM=new TreeMap<>();
        NM.put("a", 1);
        NM.put("b",2);
        NM.put("c",3);
        System.out.println(Collections.checkedNavigableMap(NM, String.class, Integer.class));*/



/*       NavigableSet<Integer> NS=new TreeSet<>();
       NS.add(1);
       NS.add(2);
       NS.add(3); 
       System.out.println(Collections.checkedNavigableSet(NS, Integer.class));*/



   /*    Queue<String> q=new PriorityQueue<>();
       q.add("z");
       q.add("y");
       q.add("x");
       System.out.println(Collections.checkedQueue(q, String.class));*/


   /*    HashSet<Character> HS=new HashSet<>();
       HS.add('Z');
       HS.add('Y');
       HS.add('X');
       System.out.println(Collections.checkedSet(HS, Character.class));*/


   /*    SortedMap<Integer,String> SM=new TreeMap<Integer,String>() ;
       SM.put(1,"A");
       SM.put(2,"B");
       SM.put(3,"C");
       System.out.println(Collections.checkedSortedMap(SM, Integer.class, String.class));*/


    /*   SortedSet<String> SS=new TreeSet<>();
       SS.add("Hello");
       SS.add("Good");
       SS.add("Morning");
       System.out.println(Collections.checkedSortedSet(SS, String.class));*/


    /*   ArrayList<Integer> arr1=new ArrayList<>();
       arr1.add(10);
       arr1.add(20);
       arr1.add(40);
       ArrayList<Integer> arr2=new ArrayList<>();
       arr2.add(10);
       arr2.add(30);
       arr2.add(40);
       arr2.add(50);
       Collections.copy(arr2,arr1);
       System.out.println(arr2);*/


     /*  ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(-40);
        arr.add(50); 
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        System.out.println(Collections.disjoint(arr,arr1));*/

       /* Enumeration<Integer> EM=Collections.emptyEnumeration();
        while(EM.hasMoreElements())
        {
            System.out.println(EM.nextElement());
        }
          System.out.println("Enumeration is not emty");*/


         /*Iterator<Integer> itr=Collections.emptyIterator();
         while(itr.hasNext())
         {
             System.out.println(itr.next());
         }
         System.out.println("Empty iterator");*/

      /*  List<Integer> L=Collections.emptyList();
        System.out.println(L);*/

     /*   ListIterator<Integer> LI=Collections.emptyListIterator();
        while(LI.hasNext())
        {
            System.out.println(LI.next());
        }
        System.out.println("Empy Listiterator");*/



      /*  Map<Integer,String> M=Collections.emptyMap();
        System.out.println(M);*/

      /*  NavigableMap<Integer,String> NM=Collections.emptyNavigableMap();
        System.out.println(NM);*/

      /*  NavigableSet<Integer> NS=Collections.emptyNavigableSet();
        System.out.println(NS);*/

       /* Set<Integer> S=Collections.emptySet();
        System.out.println(S);*/

       /* SortedMap<Integer,String> SM=Collections.emptySortedMap();
        System.out.println(SM);*/

      /*  SortedSet<Integer> SS=Collections.emptySortedSet();
        System.out.println(SS);*/

      /*  ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        Enumeration<Integer> Enum=Collections.enumeration(arr1);
        while(Enum.hasMoreElements())
        {
          System.out.println(Enum.nextElement());
        }*/

    /* Collections.fill(arr, 10);
        System.out.println(arr);*/

     /*   ArrayList<String> arr1=new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        
        System.out.println(Collections.frequency(arr1,"B"));*/

     /*  ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(10);
        arr2.add(50);
        arr2.add(60);
        arr2.add(20);
     
        System.out.println(Collections.lastIndexOfSubList(arr1, arr2));
       //System.out.println(  Collections.indexOfSubList(arr1, arr2));*/


   /*  Vector<String> V=new Vector<>();
     V.add("A");
     V.add("B");
     Enumeration<String> E=V.elements();
     List<String> L=Collections.list(E);
     System.out.println(L);*/



   //  System.out.println(Collections.max(arr));

   //  System.out.println(Collections.min(arr));


     /*  List<String> L=Collections.nCopies(4, "A");
       System.out.println(L);*/


    /*   Map<String,Boolean> M=new HashMap<>();
       Set<String> S=Collections.newSetFromMap(M);
       S.add("A");
       S.add("B");
       S.add("C");
       System.out.println(S);
       System.out.println(M);*/



     /*  ArrayList<Integer> arr1=new ArrayList<>();
       arr1.add(10);
       arr1.add(20);
       arr1.add(30);
       Collections.replaceAll(arr1, 10, 50);
       System.out.println(arr1);*/

       /*Collections.reverse(arr);
       System.out.println(arr);*/

      //System.out.println(Collections.reverseOrder() );


      System.out.println(arr);
    /*  Collections.rotate(arr, 2);
      System.out.println(arr);*/


     /* Collections.shuffle(arr);
      System.out.println(arr);*/

  /* ArrayList<Integer> arr1=new ArrayList<>();
      arr1.add(10);
      arr1.add(20);
      arr1.add(30);
      arr1.add(10);
      arr1.add(50);
      System.out.println(Collections.singletonList(arr1));
      arr1.remove(2);
      System.out.println(arr1);  
      arr1.removeAll(Collections.singleton(10));  
      System.out.println(arr1);  */



 /*  Collections.sort(arr);
   System.out.println(arr);*/

  /* Collections.swap(arr, 2, 3);
   System.out.println(arr);*/

   //System.out.println(Collections.synchronizedCollection(arr));


 //  System.out.println(Collections.synchronizedList(arr));

 /*  Map<Integer,String> M=new HashMap<>();
     M.put(1,"A");
     M.put(2, "B");
     M.put(3,"C");
     M.put(4,"D");
    System.out.println(Collections.synchronizedMap(M));
    System.out.println(Collections.singletonMap(1, "A"));*/

  /*  NavigableMap<String,String> NM=new TreeMap<>();
    NM.put("1","Ant");
   
    NM.put("3","Cat");
    NM.put("4","Dog");
    NM.put("2","Bear");
  //  Collections.synchronizedNavigableMap(NM);
      Collections.synchronizedSortedMap(NM);
        System.out.println(NM);*/

   /* NavigableSet<Integer> NM=new TreeSet<>();
    NM.add(1);
    NM.add(2);
    NM.add(3);
    NM.add(4);
  //  Collections.synchronizedNavigableSet(NM);
    
    System.out.println(NM);*/


   /*   
    Set<String> S = new HashSet<String>();  
    S.add("A");  
    S.add("C");  
    S.add("B");  
    S.add("D");      
     Collections.synchronizedSet(S);  
      System.out.println(S);  
        */
 
        /*SortedMap<String, Integer> map = new TreeMap<String, Integer>();  
        map.put("Ten", 10);  
        map.put("Twenty", 20);  
        map.put("Thirty", 30);  
        map.put("Fourty", 40);  
        SortedMap<String, Integer> map2 = Collections.unmodifiableSortedMap(map);  
         map.put("Fifty", 50);  
        System.out.println(map2);  */
       
        /* SortedMap<String, String> map = new TreeMap<String, String>();  
        map.put("1", "Whatsapp");  
        map.put("4", "Instagram");  
        map.put("3", "Facebook");  
        map.put("2", "Twitter");  
        SortedMap<String, String> sortmap = Collections.synchronizedSortedMap(map);  
        System.out.println("Synchronized sorted map is :" + sortmap);  */
       
        /* SortedSet<String> set = new TreeSet<String>();  
          //Add values in the set  
          set.add("Facebook");  
          set.add("Twitter");  
          set.add("Whatsapp");  
          set.add("Instagram");  
          //Create a synchronized sorted set  
          Set<String> synset = Collections.synchronizedSortedSet(set);  
          System.out.println("Synchronized Sorted set is :"+synset); */
          
          /* Collection<String> c = new ArrayList<>();  
        Collections.addAll(c, "Google", "Mozila FireFox", "Yahoo");  
        System.out.println("Initial Collection: "+ c);  
        Collection<String> c2 = Collections.unmodifiableCollection(c);         
        c2.add("Safari");    */
       
        /*List<String> list = new ArrayList<>();  
        Collections.addAll(list, "Google", "Mozila FireFox", "Yahoo");  
        List<String> list2 = Collections.unmodifiableList(list);  
        System.out.println("Unmodifiable List: " + list2);  
        list2.add("Safari");   */
       
        /*NavigableSet<Integer> set = new TreeSet<>();  
            Collections.addAll(set, 1,2,3,4,5);  
            System.out.println("Initial Set: " + set);  
            NavigableSet<Integer> set2 = Collections.unmodifiableNavigableSet(set);  
            System.out.println("Unmodifiable Navigable Set: " + set2);  
            //Modifying the original set  
            set.add(15);  
            System.out.println("Unmodifiable Navigable Set: " + set2);  */
            
      /* NavigableMap<Integer, String> map = new TreeMap<>();  
        map.put(1, "one");  
        map.put(2, "two");  
        System.out.println("Initial Unmodifiable Navigable Map: "+map);  
        NavigableMap<Integer, String> map2 = Collections.unmodifiableNavigableMap(map);  
        map2.put(3, "three");  */
    
        /*SortedMap<String, String> map = new TreeMap<String, String>();  
         map.put("1", "Whatsapp");  
         map.put("4", "Instagram");  
         map.put("3", "Facebook");  
         map.put("2", "Twitter");  
           System.out.println("Original Map: " + map);  
           SortedMap<String, String> map2 = Collections.unmodifiableSortedMap(map);  
           map.put("5","Hangout");  
           System.out.println("Unmodifiable Sorted Map: " + map2); */
    
           /*SortedSet<String> set = new TreeSet<String>();  
          //Add values in the set  
          set.add("Facebook");  
          set.add("Twitter");  
          set.add("Whatsapp");  
          set.add("Instagram");  
          //Create a Unmodifiable sorted set  
          SortedSet<String> set2 = Collections.unmodifiableSortedSet(set);  
          System.out.println("Unmodifiable Sorted set is :"+set2);  
          set.add("Google");  
          System.out.println("Unmodifiable Sorted set after modify is:"+set2);*/
        
    }
}
