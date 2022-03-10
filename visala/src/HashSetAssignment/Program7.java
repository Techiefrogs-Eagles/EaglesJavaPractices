package src.HashSetAssignment;

import java.util.HashSet;

public class Program7 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");
        H.add("Five");
        Object arr[]=H.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }

    }
}
