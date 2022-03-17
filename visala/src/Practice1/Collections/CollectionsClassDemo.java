package src.Practice1.Collections;

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

import javax.lang.model.type.NullType;

public class CollectionsClassDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(-40);
        arr.add(50);
   /*   ArrayList <Integer> arr1=new ArrayList<>();   //add the new elements and old elements.
        Collections.addAll(arr1, 10,30,-40);
        System.out.println(arr1);*/

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

     /* ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        arr1.add(60);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(30);
        arr2.add(40);
        arr2.add(50);
      
     
        System.out.println(Collections.lastIndexOfSubList(arr1, arr2));
       System.out.println(  Collections.indexOfSubList(arr1, arr2));*/


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
   Collections.synchronizedNavigableSet(NM);
    
    System.out.println(NM);*/


      
   /* Set<String> S = new HashSet<String>();  
    S.add("A");  
    S.add("C");  
    S.add("B");  
    S.add("D");      
     Collections.synchronizedSet(S);  
      System.out.println(S);  */

   /*  Collection<String> C=new ArrayList<>();
      C.add("Mokshitha");
      C.add("Tarak");
      C.add("Siva");
      Collection<String> C1=Collections.unmodifiableCollection(C);
      Collections.addAll(C, "Nandigam");
      System.out.println(C1);*/
       

    /*  List<Integer> L=new ArrayList<>();
      L.add(1);
      L.add(2);
      L.add(3);
      List<Integer> L1=Collections.unmodifiableList(L);
      Collections.addAll(L, 4,5);
      System.out.println(L1);*/


    /*  Map<Integer,String> M=new HashMap<>();
      M.put(1, "A");
      M.put(2, "B");
      M.put(3,"C");
      Map<Integer,String> M1=Collections.unmodifiableMap(M);
      M.put(4,"D");
      System.out.println(M1);*/


    /*Set<String> S=new TreeSet<>();
      S.add("A");
      S.add("B");
      S.add("C");
      Set<String> S1=Collections.unmodifiableSet(S);
      S.add("D");
      System.out.println(S1);*/
      
    /*  NavigableMap<String, Integer> NM= new TreeMap<>();
      NM.put("Apple", 1);
      NM.put("Bat",2);
      NM.put("Cat",3);
      NavigableMap<String,Integer> NM1=Collections.unmodifiableNavigableMap(NM);
      NM.put("Dog", 4);
      System.out.println(NM1);*/

     /* NavigableSet<String> NM=new TreeSet<>();
      NM.add("A");
      NM.add("B");
      NM.add("C");
      NavigableSet<String> NM1=Collections.unmodifiableNavigableSet(NM);
      NM.add("D");
      NM.add("E");
      System.out.println(NM1);    */
      
     /* SortedMap<Integer, Integer> SM=new TreeMap<Integer,Integer>();
      SM.put(1, 10);
      SM.put(2,20);
      SM.put(3,30);
      SortedMap<Integer,Integer> SM1=Collections.unmodifiableSortedMap(SM);
      SM.put(4,40);
      System.out.println(SM1);*/

      SortedSet<String> SM=new TreeSet<>();
      SM.add("A");
      SM.add("B");
      SM.add("C");
      SortedSet<String> SM1=Collections.unmodifiableSortedSet(SM);
      SM.add("D");
      System.out.println(SM1);
               
    }
}
