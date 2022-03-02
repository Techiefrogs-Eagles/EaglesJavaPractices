package src.Practice1.TypeCasting;

public class TypeCastingDemo {
       public static void main(String[] args) {

        //Widening or implicit or automatic
        //low to higher
           byte b=13;
           short s=b;
           char c=65;
           int a=20;
           long l=a;
           float f=l;
           double d=f;
           System.out.println(b);
           System.out.println(s);
           System.out.println(c);
           System.out.println(a);
           System.out.println(f);
            System.out.println(d);
            a=c;
            System.out.println(a);

            //Narrowing or explicit 
          //  higher to loe

            double d1=30;
            float f1=(float)d1;
            long l1=(long)f1;
            int i1=(int)l1;
            short s1=(short)i1;
            byte b1=(byte)s1;
            System.out.println(d1);
            System.out.println(f1);
            System.out.println(l1);
            System.out.println(i1);
            System.out.println(s1);
            System.out.println(b1);
        

        //type pramotion in expresion
        int i2=1231231223;
        int i3=283746574;

        long l2=(long)(i2*i3);
        System.out.println(l2);

        short s2=7;
        long  l3=32;
        double d3=s2+l3;
        int i4=(int)(s2+l3);

        System.out.println(d3);
        System.out.println(i4);


    }
}
