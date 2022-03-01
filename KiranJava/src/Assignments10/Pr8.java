package Assignments10;

public class Pr8 {
    
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
            
        

        }catch(ArithmeticException ae){

        
        System.out.println(ae);
    }
    try{
        sum(10,0);
    }catch(ArithmeticException ax)
    {
        sum(10,2);
      
    }
}
}
