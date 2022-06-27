package src.Practice1.Functionalinterface;

@FunctionalInterface
public interface FulctionalinterfaceDemo {
    void Method(String s);

    default void default1() {
        System.out.println("This is default method");
    }

    static void Static1() {
        System.out.println("This is static method");
    }

}
