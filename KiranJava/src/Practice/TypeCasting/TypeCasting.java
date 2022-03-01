package Practice.TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        byte by=2;
        short sh=7;
        int a=9;
        long b=7;
        float f=9.0f;
        double d=89.98;
        //Widening or Automatic Type Conversion
        sh=by;
        a=sh;
        b=a;
        f=b;
        d=f;
        
        System.out.println(by+" "+sh+" "+a+" "+b+" "+f+" "+d);
        //Narrowing or Explicit Type conversion
        double dou=45678.87;
        int n=(int)dou;
        byte bi=(byte)dou;
        short sho=(short)dou;
        long lo=(long)dou;
        float fl=(float)dou;
        char ch=(char)dou;
        System.out.println(dou);
        System.out.println(n);
        System.out.println(bi);
        System.out.println(sho);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(ch);


    }
}
