package src.Practice1.Practice;

public class unaryoperator {
    public static void main(String[] args) throws Exception {
        int a =6;
        int b =5;

        System.out.println(a++);
        System.out.println(a);
        
        System.out.println(++a);
        System.out.println(a);

        System.out.println(b--);
        System.out.println(b);

        System.out.println(--b);
        System.out.println(b);
        

        System.out.println(a++ + ++a);
        System.out.println(a);
        
        System.out.println(++b + b++);
        System.out.println(b);
           
        boolean c =false;
        a=5;
        System.out.println(!c);

        System.out.println(~a);


    }
}
