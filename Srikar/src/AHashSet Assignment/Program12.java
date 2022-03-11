import java.util.HashSet;

public class Program12 {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
       
        obj.clear();
        System.out.println("Cleared all Elements");
        System.out.println(obj);
        
    }
    
}