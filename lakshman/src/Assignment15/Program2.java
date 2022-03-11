package Assignment15;

import java.util.Iterator;
import java.util.TreeSet;

public class Program2 {
    public static void main(String[] args) {
        TreeSet<String> colour = new TreeSet<>();
        colour.add("blue");
        colour.add("grey");
        colour.add("white");
        colour.add("green");
        colour.add("black");

        Iterator<String> itr = colour.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
