package Assignment14;

import java.util.HashSet;

public class Program4 {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        obj.clear();
        System.out.println(obj);
        
    }
}
