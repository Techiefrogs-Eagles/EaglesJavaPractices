import java.util.*;  
public class VectorListDemo {  
       public static void main(String args[]) {  
        //Create an empty Vector        
        Vector<String> obj1 = new Vector<>();  
        //Add elements in the vector  
        obj1.add("123");  
        obj1.add("345");  
        obj1.add("567");  
        obj1.add("789");  
        obj1.add("91011");  
        obj1.add("111213");    
        //Display the vector elements  
        System.out.println("Values in vector: " +obj1);  
        //use remove() method to delete the first occurence of an element  
        System.out.println("Remove first occourence of element 111213: "+obj1.remove((String)"111213"));  
        //Display the vector elements afre remove() method  
        System.out.println("Values in vector: " +obj1);  
        //Remove the element at index 4  
        System.out.println("Remove element at index 4: " +obj1.remove(4));  
        System.out.println("New Value list in vector: " +obj1);  
        //Remove an element  
        obj1.removeElementAt(789);        
        //Checking vector and displays the element  
        System.out.println("Vector element after removal: " +obj1);  
        //Get the hashcode for this vector  
        System.out.println("Hash code of this vector = "+obj1.hashCode());  
        //Get the element at specified index  
        System.out.println("Element at index 1 is = "+obj1.get(1));  
          }  
}  