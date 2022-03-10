package Assignment14;

import java.util.HashSet;

public class Program14 {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        HashSet<String> obj1 = new HashSet<>();
        obj1.add("F");
        obj1.add("G");
        obj1.add("H");
        obj1.add("I");
        obj1.add("J");

        obj.addAll(obj1);
        
        HashSet<String> obj2 = new HashSet<>(obj);
        System.out.println(obj2);
    }
}
