package src.Revision.Methodreferences;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
/* 
@FunctionalInterface
interface printable {
    void print(String string);
}*/

public class Mrefernces {
    // public void display(String s) {
    // String str = s.toLowerCase();
    // System.out.println(str);
    // }

    public static int addition(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        // Method reference to a static method
        /*
         * Function<Integer, Double> function = (input) -> Math.sqrt(input);
         * System.out.println(function.apply(2));
         * 
         * Function<Integer, Double> functionmethodref = Math::sqrt;
         * System.out.println(functionmethodref.apply(2));
         */

        /*
         * Supplier<LocalDateTime> sup = () -> LocalDateTime.now();
         * System.out.println(sup.get());
         * 
         * Supplier<LocalDateTime> sup1 = LocalDateTime::now;
         * System.out.println(sup1.get());
         */
        BiFunction<Integer, Integer, Integer> add1 = Mrefernces::addition;
        System.out.println(add1.apply(5, 10));

        // reference to an instance method of a particular object

        Mrefernces mref = new Mrefernces();
        // Lambda
        /*
         * printable p = (string) -> mref.display(string);
         * p.print("Hello");
         * // Reference
         * printable p1 = mref::display;
         * p1.print("HELLO");
         */

        // Reference to an instance method of an arbitary object

        Function<String, String> fun = (input) -> input.toUpperCase();
        System.out.println(fun.apply("abcd"));

        Function<String, String> fun1 = String::toUpperCase;
        System.out.println(fun1.apply("abcd"));
        // Reference to a constructor
        List<String> L = new ArrayList<>();
        Collections.addAll(L, "Apple", "Bannan", "Mango", "CusterdApple");
        Function<List<String>, Set<String>> function1 = (LList) -> new HashSet(LList);
        System.out.println(function1.apply(L));
        Function<List<String>, Set<String>> function2 = HashSet::new;
        System.out.println(function2.apply(L));

    }

}
