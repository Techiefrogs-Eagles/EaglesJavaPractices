package Interface;

public interface staticandDefault4 {
    int a = 10;
    //static { a=10; }
    void fan();
    
    default void normalmet1(){
        System.out.println( "in normet1 default method 1");
    }
    
}
