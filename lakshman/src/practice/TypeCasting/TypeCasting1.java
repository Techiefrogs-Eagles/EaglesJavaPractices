package practice.TypeCasting;

public class TypeCasting1 {
    public static void main(String[] args) {
        int a = 13; 
        byte b = (byte)a;
        long k = 20;
        long s = b+k ;
        char c = (char)b;
        System.out.println(c);
        System.out.println(s);
        System.out.println(b);

        short d = 100;
        int e = d;
        System.out.println(e);

        int x= 1234564545;
        int y = 1234556566;
        //long z = (long)x*y;
        System.out.println((long)x*y);

        System.out.println();
    }
}
