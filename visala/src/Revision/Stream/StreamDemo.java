package src.Revision.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        System.out.println(l);
        Integer[] i = l.stream().toArray(Integer[]::new);
        Stream.of(i).forEach(System.out::println);
        /*
         * List<Integer> l1 = l.stream().filter(i -> i % 2 ==
         * 0).collect(Collectors.toList());
         * System.out.println("Filter:" + l1);
         * List<Integer> l2 = l.stream().map(i -> i + 5).collect(Collectors.toList());
         * System.out.println("Map:" + l2);
         * long l3 = l.stream().filter(i -> i <= 10).count();
         * System.out.println("Count:" + l3);
         * List<Integer> l4 = l.stream().sorted().collect(Collectors.toList());
         * System.out.println("Sorted:" + l4);
         * int min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
         * System.out.println("Min:" + min);
         * int max = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
         * System.out.println("Max:" + max);
         * List<Integer> l5 = l.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ?
         * -1 : 0)
         * .collect(Collectors.toList());
         * System.out.println(l5);
         * l.stream().forEach(System.out::print);
         * l.stream().forEach(i -> {
         * System.out.println(+i + "square of" + i * i);
         * });
         * 
         * ArrayList<String> s = new ArrayList<>();
         * s.add("A");
         * s.add("A");
         * s.add("AAAAA");
         * s.add("AAAA");
         * s.add("AAA");
         * s.add("AA");
         * System.out.println(s);
         * Comparator<String> S = (s1, s2) -> {
         * int a = s1.length();
         * int b = s2.length();
         * if (a < b)
         * return -1;
         * else if (a > b)
         * return 1;
         * else
         * return s1.compareTo(s2);
         * };
         * List<String> l6 = s.stream().sorted(S).collect(Collectors.toList());
         * System.out.println(l6);
         */
    }
}
