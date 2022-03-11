
import java.util.LinkedList;

public class Program15 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");
        
        String temp = obj.get(4);
        obj.set(4, obj.get(2));
        obj.set(2, temp);

        for (String string : obj) 
        {
            System.out.println(string);
        }
    }
}