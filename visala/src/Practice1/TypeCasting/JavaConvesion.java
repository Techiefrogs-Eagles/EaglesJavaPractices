package src.Practice1.TypeCasting;

public class JavaConvesion {
    public static void main(String[] args) {

        // String to integer

        String S = "123";
        int A = Integer.parseInt(S); // string to integer
        System.out.println(A);
        System.out.println(S + 100);
        System.out.println(A + 100);
        System.out.println();

        int A1 = Integer.valueOf(S);
        System.out.println(A1);
        System.out.println(A1 + 100);
        System.out.println();
        /*
         * String s2="Hello";
         * //int a2=Integer.parseInt(s2); //Number formate exception
         * //System.out.println(a2);
         */

        // Integer to string

        int a1 = 100;
        String s1 = String.valueOf(a1);
        System.out.println(a1 + 100); // + is binary plus operator
        System.out.println(s1 + 100); // + is string concatenation operator
        System.out.println();
        int a2 = 200;
        String s2 = String.format("%d", a2); // integer to string
        System.out.println(s2);
        System.out.println();

        // String to long
        String Sl = "123456789111";
        long l = Long.parseLong(Sl); // String to long
        System.out.println(l);
        System.out.println();

        // Long to String

        long L = 21678686786l;
        String S3 = String.valueOf(L);
        System.out.println(S3);
        System.out.println();

        // String to float

        float f = Float.parseFloat(S); // string to float
        System.out.println(f);
        System.out.println(f + 100);
        System.out.println();

        // float to String
        float F = 23.3f;
        String S4 = String.valueOf(F);
        System.out.println(S4);
        System.out.println();

        // String to double

        double d = Double.parseDouble(S);
        System.out.println(d);
        System.out.println();

        // Double to string
        double D = 123454657566d;
        String S5 = String.valueOf(D);
        System.out.println(S5);
        System.out.println();

        // String to char

        String S6 = "Hello";
        for (int i = 0; i < S6.length(); i++) {
            char C = S6.charAt(i);
            System.out.println(C);

        }
    }

}
