package src.Interface;

public interface SandD1 {

    default void default2()
    {
        System.out.println("This is default2");

    }
    default void default1()
    {
        System.out.println("This is default1");

    }
   /* static void static1()
    {
        System.out.println("This is static1");

    }*/
    static void static2()
    {
        System.out.println("This is static2");
    }
}
