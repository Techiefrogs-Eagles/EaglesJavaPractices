package Interface;

public interface staticandDefault2 {
    void light();
    default void normalmet2(){
        System.out.println( "in normet2 default method 2");
    }

    static void king2(){
        System.out.println("i king2 method");
    }
}
