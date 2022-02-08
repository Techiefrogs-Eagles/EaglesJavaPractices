package Interface;

public interface staticandDefaullt1 {
    void fan();
    
    default void normalmet1(){
        System.out.println( "in normet1 default method 1");
    }

    static void king(){
        System.out.println("i king method");
    }

}
