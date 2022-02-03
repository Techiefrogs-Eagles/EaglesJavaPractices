package Abstract;

abstract  public class Abstractdemo {
    int i=10;
   String s="Java";

    abstract void display();
    void display1()
    {
        System.out.println("This is display1");
    }

    void newdisplay()
    {
        System.out.println("This is new display ");
    }

    final void finaldisplay()
    {
   System.out.println("this is final display");
    }
    static void staticdisplay()
    {
        System.out.println("this is static display");
    }
}
