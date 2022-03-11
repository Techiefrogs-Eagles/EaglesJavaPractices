package Assignment15;

import java.util.TreeSet;

public class Program9 {
    public static void main(String[] args) {
        TreeSet<Integer> colour = new TreeSet<>();
        colour.add(10);
        colour.add(2);
        colour.add(33);
        colour.add(46);
        colour.add(5);

        System.out.println(colour.headSet(7));
    }
}
