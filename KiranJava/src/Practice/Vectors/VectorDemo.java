package Practice.Vectors;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<>(7);
        vec.add("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
          vec.add("Elephant");  
          //Adding elements using addElement() method of Vector  
          vec.addElement("Rat");  
          vec.addElement("Cat");  
          System.out.println(vec);
            //Check size and capacity  
            System.out.println("Size is: "+vec.size());  
            System.out.println("Default capacity is: "+vec.capacity()); 
           System.out.println( vec.contains("Tiger"));
            //Get the first element  
          System.out.println("The first animal of the vector is = "+vec.firstElement());   
          //Get the last element  
          System.out.println("The last animal of the vector is = "+vec.lastElement()); 
          //removing elements
          vec.remove((String)"Lion");
          vec.remove(1);
          System.out.println(vec);
           //Get the hashcode for this vector  
        System.out.println("Hash code of this vector = "+vec.hashCode()); 
        System.out.println(vec.get(1)); 
        Iterator<String> itr=vec.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
