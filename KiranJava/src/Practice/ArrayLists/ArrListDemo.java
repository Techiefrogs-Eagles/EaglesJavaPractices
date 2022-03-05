package Practice.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Mango");  
        list1.add("Apple");  
        list1.add("Banana");  
        list1.add("Grapes");  
  //Sorting the list  
        Collections.sort(list1);
        System.out.println(list1);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Mango");  
        list2.add("Apple");  
        list2.add("Banana"); 
        list2.remove(0);
        list1.retainAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        list1.trimToSize();
    }
}
