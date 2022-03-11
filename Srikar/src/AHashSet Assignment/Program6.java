

        import java.util.HashSet;

public class Program6 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("chair");
        hashSet.add("table");
        hashSet.add("Laptop");
        hashSet.add("Charger");

        hashSet.add("Pen");
        HashSet<String> H1=new HashSet<>(hashSet);
        System.out.println(H1);
        
    }

}
