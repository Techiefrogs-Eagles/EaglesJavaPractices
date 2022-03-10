package Assignment13;

import java.util.PriorityQueue;

public class Program7 {
    public static void main(String[] args) {
        PriorityQueue<String> colour = new PriorityQueue<String>();
        colour.offer("Green");

        PriorityQueue<String> colours = new PriorityQueue<String>();
        colours.offer("Green");

        System.out.println(colour.equals(colours));
    }
}
