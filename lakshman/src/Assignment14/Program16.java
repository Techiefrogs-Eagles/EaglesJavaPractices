package Assignment14;

import java.util.HashSet;

public class Program16 {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");
        obj.add("F");   

        HashSet<String> obj1 = new HashSet<>();
        obj1.add("A");
        obj1.add("B");
        obj1.add("C");

        obj.removeAll(obj1);

        HashSet<String> obj2 = new HashSet<>(obj);
        
        System.out.println(obj2);    
    }
}
