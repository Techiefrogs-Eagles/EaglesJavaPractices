



import java.util.HashSet;

public class Program7 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("chair");
        hashSet.add("table");
        hashSet.add("Laptop");
        hashSet.add("Charger");
        
        hashSet.add("Pen");
        Object arr[]=hashSet.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }

    }
}