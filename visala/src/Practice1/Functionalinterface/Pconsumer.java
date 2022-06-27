package src.Practice1.Functionalinterface;

import java.util.function.Consumer;

/*class consumerimp implements Consumer<String> {

    @Override
    public void accept(String t) {
        System.out.println(t);

    }

}*/

public class Pconsumer {
    public static void main(String[] args) {
        // Consumer<String> consumer1 = new consumerimp();
        // consumer1.accept("Hello");
        Consumer<String> consumer1 = (t) -> System.out.println(t);
        consumer1.accept("Hello");
    }
}
