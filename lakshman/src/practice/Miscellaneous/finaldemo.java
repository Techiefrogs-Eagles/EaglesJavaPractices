package practice.Miscellaneous;

public class finaldemo 
{
    final int a = 10;
    final int b;
    { b=11; }
    final int c;
    final static int d = 13;
    final static int e;
    static { e = 14; }
    finaldemo()
    {
        c = 12;
    }

    final void display()
    {
        System.out.println("hello lakshman");
    }

    final static void lakshman()
    {
        System.out.println("lakshman hello");
    }
}

final class samyak extends finaldemo
{
    // void display(){}
    /* final static void lakshman()
    {
        System.out.println("lakshman hello");
    }
    public static void main(String[] args) {
        samyak.lakshman(); 
    } */
}
