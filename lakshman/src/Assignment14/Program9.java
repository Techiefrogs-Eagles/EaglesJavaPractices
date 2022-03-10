package Assignment14;

import java.util.ArrayList;
import java.util.HashSet;

public class Program9 {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        ArrayList<String> obj1 = new ArrayList<>(obj);
        System.out.println(obj1);
        
    }
}
