package Assignment13;

import java.util.PriorityQueue;

public class Program11 {
    public static void main(String[] args) {
        PriorityQueue<String> colour = new PriorityQueue<String>();
        colour.offer("Green");
        colour.offer("Red");
        colour.offer("Blue");
        colour.offer("Orange");
        colour.offer("Yellow");

        String k = colour.toString();
        System.out.println(k);
    }
}
