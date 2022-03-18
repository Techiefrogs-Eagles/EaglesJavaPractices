package Practice.CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<String>();  
    
        cityNames.add("Delhi");  
        cityNames.add("Mumbai");  
        cityNames.add("Kolkata");  
        cityNames.add("Chandigarh");  
        cityNames.add("Noida");  
    
        // Iterator to iterate the cityNames  
        Spliterator<String> iterator = cityNames.spliterator();
        //iterator.remove();  
    
        System.out.println("CityNames elements : ");  
    
       /* while (iterator.hasNext())  
            System.out.print(iterator.next() + " ");  */
            //iterator.remove();   
        //System.out.println(cityNames);
        System.out.println();
        iterator.forEachRemaining((n)->System.out.println(n));
    }
}
