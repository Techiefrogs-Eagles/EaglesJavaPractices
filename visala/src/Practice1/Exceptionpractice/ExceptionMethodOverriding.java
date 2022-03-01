package src.Practice1.Exceptionpractice;

import java.io.IOException;

class Driverclass1 extends IOException
{
    Driverclass1(String s)
    {
        super(s);
    }
}
public class ExceptionMethodOverriding  
{
    static void Method() throws ArrayIndexOutOfBoundsException
    {
       throw new ArithmeticException("Hello");
    }
}
class subclass extends ExceptionMethodOverriding
{
    public static void main(String[] args) {
      subclass.Method();
      ExceptionMethodOverriding.Method();
    }
        public static void Method() throws StringIndexOutOfBoundsException
        {
            
        }
    }
