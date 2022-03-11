import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Chair");
        hashSet.add("Table");
        hashSet.add("Laptop");
        hashSet.add("Charger");

        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Book");
        arrList.add("Pen");
        arrList.add("Marker");

        hashSet.addAll(arrList);

        hashSet.remove("Laptop");
         hashSet.size();

 
       
       Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}