import java.util.Collections;
import java.util.LinkedList;

public class Program16 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");
        

        Collections.shuffle(obj);

        for (String string : obj) 
        {
            System.out.println(string);
        }
    }
}