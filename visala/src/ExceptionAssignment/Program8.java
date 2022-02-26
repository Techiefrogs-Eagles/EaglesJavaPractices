package src.ExceptionAssignment;

public class Program8 {
    
    static int sum(int a, int b)
    {
        System.out.println(a/b);
      return a/b;

    }
   static int sum(int a, int b, int c)
    {
        System.out.println(a+b+c);
        return a+b+c;
    }

    
    public static void main(String[] args) {
        try{
            sum(10,20,30);
           sum(10,0);
           
           

        }catch(ArithmeticException ae){

        
        System.out.println(ae);
    }
}
}