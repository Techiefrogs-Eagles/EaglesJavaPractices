import java.util.PriorityQueue;

public class prog6 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<String>();
        colour.offer("Green");
        colour.offer("Red");
        colour.offer("Blue");
        colour.offer("Orange");
        colour.offer("Yellow");
        
        System.out.println("No.of elements in an array = "+colour.size());
    }
    
}
