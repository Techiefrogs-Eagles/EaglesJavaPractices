
//Iterate through all the elements in a hashlist
import java.util.HashSet;
import java.util.Iterator;

public class Program2 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Chair");
        hashSet.add("table");
        hashSet.add("laptop");
        hashSet.add("Charger"); 

        hashSet.add("Pen");
        Iterator<String> itr=hashSet.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}