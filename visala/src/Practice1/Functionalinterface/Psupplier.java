package src.Practice1.Functionalinterface;

import java.time.LocalDate;
import java.util.function.Supplier;

/*class supplier1 implements Supplier<LocalDate> {

    @Override
    public LocalDate get() {

        return LocalDate.now();
    }

}*/

public class Psupplier {
    public static void main(String[] args) {
        // Supplier<LocalDate> Sup = new supplier1();
        // System.out.println(Sup.get());

        Supplier<LocalDate> Sup = () -> LocalDate.now();
        System.out.println(Sup.get());
    }
}
