import java.util.HashSet;
import java.util.Iterator;

public class prog2 {
    public static void main(String[] args) {
        HashSet<String> obj=new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        obj.add("F");
        
        Iterator<String> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
    
}
