
import java.util.ArrayList;
import java.util.HashSet;

public class Program9 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("chair");
        hashSet.add("table");
        hashSet.add("Laptop");
        hashSet.add("Charger");
        
        hashSet.add("Pen");
        ArrayList<String> arr=new ArrayList<>(hashSet);
        System.out.println(arr);
    }
}