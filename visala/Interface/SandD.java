package Interface;

public interface SandD{
    void display();

    
    default void default1()
    {
        System.out.println("This is default1 method");

    }
    static void static1()
    {
        System.out.println("This is static method");

    }

}

