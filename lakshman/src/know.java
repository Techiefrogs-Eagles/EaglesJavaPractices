public class know 
{
    int a;
    static int b = 30;
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println("a"+"    "+a);
        a = 20;
        System.out.println("a"+"    "+a);
        System.out.println("b"+"    "+know.b);
        know c = new know();
        know d = new know();
        know e = new know();
        c.a = 40;
        System.out.println("c"+"    "+c.a);
        d.a = 50;
        System.out.println("d"+"    "+d.a);
        e.a = 60;
        System.out.println("e"+"    "+e.a);
        e.know1();
        know.b = 80;
        System.out.println("g(b)"+" "+know.b);
        System.out.println("The First a =   " +a);
     }
    void know1()
    {
        int f = 70;
        System.out.println("f"+"    "+f);
    }
}
