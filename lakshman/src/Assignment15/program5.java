package Assignment15;

import java.util.TreeSet;

public class program5 {
    public static void main(String[] args) {
        TreeSet<String> colour = new TreeSet<>();
        colour.add("blue");
        colour.add("grey");
        colour.add("white");
        colour.add("green");
        colour.add("black");

        System.out.println("first element = "+colour.first());
        System.out.println("last element = "+colour.last());
    }
}
