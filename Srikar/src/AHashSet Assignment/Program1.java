

//Java program to append the specified element to the end of a hash set
import java.util.HashSet;

public class Program1 {
    public static void main(String[] args) {
        
        HashSet<String> hashSet=new HashSet<>();
       
        hashSet.add("chair");
        hashSet.add("table");
        hashSet.add("Laptop");
        hashSet.add("Charger");

        hashSet.add("Pen");

        System.out.println(hashSet);

    }
}