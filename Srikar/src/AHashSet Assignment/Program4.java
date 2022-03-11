
//Program to empty an hashset here it clears every thing and wont print any element......
import java.util.HashSet;

public class Program4 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Chair");
        hashSet.add("table");
        hashSet.add("laptop");
        hashSet.add("Charger");

        
        hashSet.clear();
        System.out.println(hashSet);
    }
}