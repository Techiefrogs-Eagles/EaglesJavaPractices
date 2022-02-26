package src.ExceptionAssignment;

public class Program1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        try{
            System.out.println(a+b);

        }catch(ArithmeticException Ae)
        {
            System.out.println(Ae);
        }
    }
}
