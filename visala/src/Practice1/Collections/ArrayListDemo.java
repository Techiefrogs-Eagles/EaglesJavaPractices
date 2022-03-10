package src.Practice1.Collections;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo
{
    public static void main(String[] args) 
    {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Hello");
        obj.add("Nemo");
        obj.add("Is a ");
        obj.add("Fish");

        Collections.sort(obj);  // sorts the given ArrayList

        Iterator<String> itr = obj.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        /*for (String str : obj) 
        {
           System.out.print(str+" ");  //Iterator using for each loop
       }
              System.out.println();

       System.out.print(obj.get(0));

       System.out.println();*/

      /* obj.set(3, "Small Fish");  //changes the value at that index.

       for(int i = 0; i < obj.size(); i++)
       {
           System.out.print(obj.get(i)+" ");   //Iterator using for  loop
        System.out.println();   */  


        ArrayList<Object> obj1 = new ArrayList<Object>();
        obj1.add("Hello");
        obj1.add('I');
        obj1.add(5);
        obj1.add(true);

        Iterator<Object> itr2 =  obj1.iterator();  //Iterator for different objects.
        while (itr2.hasNext())
        {
            System.out.print(itr2.next()+" ");
        }
        System.out.println();

       /* ListIterator<Object> itr3 = obj1.listIterator();
        while(itr3.hasNext())    //check if iterator has the elements.
        {
            System.out.println(itr3.next()+" ");  
        }
       */
         A aobj = new A(20 , 30);
         A aobj1 = new A(50 , 100);

         ArrayList<A> arrobj = new ArrayList<A>(); // User Defined class objects in ArrayList
         arrobj.add(0 , aobj);
         arrobj.add(1, aobj1);
         Iterator<A> arr = arrobj.iterator();
         while (arr.hasNext()) 
         {
             A Aobj = (A)arr.next(); 
           System.out.println(Aobj.a+" "+Aobj.b);
         }
    }
}

class A
{
 int a;
 int b;
 A(int a,int b)
 {
     this.a = a;
     this.b = b;

 }
}