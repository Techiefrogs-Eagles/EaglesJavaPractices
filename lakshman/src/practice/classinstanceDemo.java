package practice;

public class classinstanceDemo 
{
    int a;
    static int b = 30;
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println("a"+"    "+a);
        a = 20;
        System.out.println("a"+"    "+a);
        System.out.println("b"+"    "+classinstanceDemo.b);
        classinstanceDemo c = new classinstanceDemo();
        classinstanceDemo d = new classinstanceDemo();
        classinstanceDemo e = new classinstanceDemo();
        c.a = 40;
        System.out.println("c"+"    "+c.a);
        d.a = 50;
        System.out.println("d"+"    "+d.a);
        e.a = 60;
        System.out.println("e"+"    "+e.a);
        e.classinstance1();
        classinstanceDemo.b = 80;
        System.out.println("g(b)"+" "+classinstanceDemo.b);
        System.out.println("The First a =   " +a);
    }
    void classinstance1()
    {
        classinstanceDemo f = new classinstanceDemo();
        f.a = 70;
        System.out.println("f"+"    "+f.a);
    }
}
