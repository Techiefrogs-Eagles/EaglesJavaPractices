import java.util.LinkedList;

public class Program18 extends LinkedList<String>{
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");
        if(obj instanceof LinkedList<String>){

        LinkedList<String> obj1 = (LinkedList<String>) obj.clone();
        
        
        for (String string : obj1) 
        {
            System.out.println(string);
        }
    }
    }
}