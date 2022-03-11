
import java.util.ArrayList;
import java.util.LinkedList;

public class Program23 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");
        

        ArrayList<String> obj2 = new ArrayList<>(obj);

        for (String string : obj2) 
        {
            System.out.println(string);
        }
    }
}