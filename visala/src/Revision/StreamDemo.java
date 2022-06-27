package src.Revision;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // create a stream
        Stream<String> str = Stream.of("A", "B", "C");
        str.forEach(System.out::println);

        // create form source
        Collection<String> collection = Arrays.asList("AAA", "BBB", "CCC");
        Stream<String> str1 = collection.stream();
        str1.forEach(System.out::println);

        List<String> list = Arrays.asList("AA", "BB", "CC");
        Stream<String> str2 = list.stream();
        str2.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> str3 = set.stream();
        str3.forEach(System.out::println);

        String[] string = { "a", "b", "c" };
        Stream<String> str4 = Arrays.stream(string);
        str4.forEach(System.out::println);
    }
}
