package Assignment14;

import java.util.HashSet;

public class Program7 {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        Object arr[] = obj.toArray();
        for (Object object : arr) {
            System.out.print(object+" ");
        }
    }
}
