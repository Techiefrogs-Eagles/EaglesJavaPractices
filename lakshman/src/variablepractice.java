public class variablepractice 
{
    static boolean    a;
    static byte       b;
    static short      c;
    static int        d;
    static long       e;
    static float      f;
    static double     g;
    static char       h;

    boolean    i;
    byte       j;
    short      k;
    int        l;
    long       m;
    float      n;
    double     o;
    char       p;

    public static void main(String[] args)
    {
       boolean        a = true;
       byte           b = 127;
       short          c = 32767;
       int            d = 2147483647;
       long           e = 9223372036854775807l;
       float          f = 1.1f;
       double         g = 1.2; 
       char           h = 'A';      
       variablepractice i = new variablepractice();
       variablepractice j = new variablepractice();
       variablepractice k = new variablepractice();
       variablepractice l = new variablepractice();
       variablepractice m = new variablepractice();
       variablepractice n = new variablepractice();
       variablepractice o = new variablepractice();
       variablepractice p = new variablepractice();
       System.out.println(a);
       System.out.println(variablepractice.a);
       System.out.println(i.i);
       System.out.println(b);
       System.out.println(variablepractice.b);
       System.out.println(j.j);
       System.out.println(c);
       System.out.println(variablepractice.c);
       System.out.println(k.k);
       System.out.println(d);
       System.out.println(variablepractice.d);
       System.out.println(l.l);
       System.out.println(e);
       System.out.println(variablepractice.e);
       System.out.println(m.m);
       System.out.println(f);
       System.out.println(variablepractice.f);
       System.out.println(n.n);
       System.out.println(g);
       System.out.println(variablepractice.g);
       System.out.println(o.o);
       System.out.println(h);
       variablepractice.h = 'B';
       System.out.println(variablepractice.h);
       p.p = 'c';
       System.out.println(p.p);
              
    }
    
}
