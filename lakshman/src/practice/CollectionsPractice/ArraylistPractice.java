package practice.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistPractice {
    public static void main(String[] args) {
        ArrayList<Object> obj = new ArrayList<Object>();
        obj.add("abc");
        obj.add('C');
        obj.add(21);
        obj.add(true);

        /*Iterator<Object> itr = obj.iterator();
        while(itr.hasNext())                            //check if iterator has the elements
        {                                                 
            System.out.print(itr.next()+" ");           //printing the element and move to next  
        }*/

        /*ListIterator<Object> itr2 = obj.listIterator(obj.size());
        while(itr2.hasPrevious())                            //check if iterator has the elements
        {                                                 
            System.out.print(itr2.previous()+" ");           //printing the element and move to Previous  
        }*/
        
        //Collections.sort((List<T>) obj);              // not possible because of non similar data types    

       /*for (Object m : obj) {
            System.out.print(m+" ");                    // iterating using for-each loop
        }*/

        obj.set(1,'D');
        //System.out.println(obj.get(0));               // prints value at that index

        /*for (int i = 0; i < obj.size(); i++) {
            System.out.print(obj.get(i)+" ");            // iterating using for loop
        }*/

        ArrayList<String> obj1 = new ArrayList<String>();
        obj1.add("Hello");
        obj1.add("Good");
        obj1.add("Morning");
        obj1.add("All");

        Collections.sort(obj1);                          // sorts the given input ArrayList               

        /*Iterator<String> itr1 = obj1.iterator();
        while (itr1.hasNext()) 
        {
            System.out.print(itr1.next()+" ");
        }*/
        
        temporary tobj = new temporary(10, 20);
        temporary tobj1 = new temporary(100, 200);

        ArrayList<temporary> alobj = new ArrayList<temporary>();
        alobj.add(0, tobj);
        alobj.add(1, tobj1);
        /*Iterator<temporary> kobj = alobj.iterator();
        while (k.hasNext()) {
            temporary temp = (temporary)kobj.next();
            System.out.println(temp.y+"  "+temp.z);
        }*/
    }
}

class temporary{
    int y;
    int z;
    temporary(int y,int z){
        this.y = y;
        this.z = z;
    }
}