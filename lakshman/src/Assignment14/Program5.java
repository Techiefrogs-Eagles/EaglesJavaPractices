package Assignment14;

import java.util.HashSet;

public class Program5 {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        obj.clear();
        if (obj.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is not empty");
        }
        System.out.println(obj);
        
    }
}
