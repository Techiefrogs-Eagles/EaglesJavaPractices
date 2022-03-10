package Assignment14;

import java.util.HashSet;

public class program10 {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        HashSet<String> obj1 = new HashSet<>();
        obj1.add("A");
        obj1.add("B");
        obj1.add("C");
        obj1.add("D");
        obj1.add("E");

        obj.retainAll(obj1);
        
        if (obj.isEmpty()) {
            System.out.println("The given HASHSETS are not equal");
        } 
        else 
        {
            System.out.println("The given HASHSETS are equal");
        }     
    }
}
