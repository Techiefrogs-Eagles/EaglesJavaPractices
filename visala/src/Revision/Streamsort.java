package src.Revision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsort {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("One");
        obj.add("Two");
        obj.add("Three");
        obj.add("Four");
        obj.add("Five");
        // Assending order
        List<String> sorted = obj.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        sorted.forEach(System.out::println);

        List<String> sorted1 = obj.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sorted1);
        List<String> sorted2 = obj.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted2);

        // desending order
        List<String> sorted3 = obj.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sorted3.forEach(System.out::println);

    }
}