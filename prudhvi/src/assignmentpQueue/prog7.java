import java.util.PriorityQueue;

public class prog7 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<String>();
        
        
        colour.offer("Red");

        PriorityQueue<String> colours = new PriorityQueue<String>();
        colours.offer("Red");

        System.out.println(colour.equals(colours));

    }
    
}
