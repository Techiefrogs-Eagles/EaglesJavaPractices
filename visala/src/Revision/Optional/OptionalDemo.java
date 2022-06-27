package src.Revision.Optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // of,empty,ofNullable

        Optional<Object> opt = Optional.empty();
        System.out.println(opt);

        String s = "Good Morning";
        Optional<String> opt1 = Optional.of(s);
        System.out.println(opt1.get());
        String s2 = null;
        Optional<String> opt2 = Optional.ofNullable(s2);
        System.out.println(opt2);

        /*
         * if (opt2.isPresent()) {
         * System.out.println(opt2.get());
         * } else {
         * System.out.println("No argument");
         * }
         */
        System.out.println(opt2.orElse("good evening"));
        System.out.println(opt1.orElseGet(() -> "Good "));

        System.out.println(opt1.orElseThrow());
        System.out.println(opt1.orElseThrow(() -> new IllegalArgumentException("Hello")));

        /*
         * Optional<String> O = Optional.empty();
         * O.ifPresent((S) -> System.out.println("No value"));
         * 
         * Optional<String> O1 = Optional.of("Googd");
         * O1.ifPresent((S) -> System.out.println("GoogNight"));
         */

        String S = "  Hello";
        if (S != null && S.contains("Hello")) {
            System.out.println(S);
        }
        Optional<String> O1 = Optional.of(S);
        O1.filter(s1 -> s1.contains("Hello")).map(String::trim).ifPresent((s1) -> System.out.println(s1));
    }
}
