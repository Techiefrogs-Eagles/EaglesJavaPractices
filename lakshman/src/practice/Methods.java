package practice;

public class Methods 
{
    public static void main(String[] args) 
    {
        int a = 10;
        String str = "ABCD";
        Methods metobj = new Methods();
        metobj.lakshman();
        int c = metobj.venkat();
        String l = Methods.varma();
        boolean z = Methods.bhaskar(70,"hello.java");
        System.out.println(a+"   "+str+"   "+c+"   "+l+"   "+z);

    }

    static boolean bhaskar(int a,String b)
    {
        System.out.println("printing bhaskar's method");
        return false;
    }
    static String varma()
    {
        String hi = "VARMA"; 
        Methods metobj3 = new Methods();
        metobj3.lakshman();
        return hi;

    }

    void lakshman()
    {
        int b = 20;
        String hello = "Lakshman";
        System.out.println(b+"   "+hello);
        Methods metobj2 = new Methods();
        metobj2.venkat();
    }

    int venkat()
    {
        Methods metobj1 = new Methods();
        int k = 6;
        return k;
    }
}
