package src.Practice1.Functionalinterface;

import java.util.function.Function;

/*class function1 implements Function<String, Integer> {

    @Override
    public Integer apply(String t) {
        return t.length();
    }

}*/

public class Fpredefine {
    public static void main(String[] args) {
        // Function<String, Integer> fun = new function1();
        // fun.apply("Java");
        // System.out.println(a);

        Function<String, Integer> fun = (String t) -> t.length();
        System.out.println(fun.apply("Java"));

    }
}
