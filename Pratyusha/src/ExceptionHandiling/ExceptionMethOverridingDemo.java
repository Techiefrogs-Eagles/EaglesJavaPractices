package ExceptionHandiling;

import java.io.IOException;

class Elephant extends IOException
{
    Elephant(String s)
    {
        super(s);
    }
}
public class ExceptionMethOverridingDemo 
{
     void Cat() throws ArrayIndexOutOfBoundsException
    {
       throw new ArithmeticException("Hello Elephant");
    }
}
class Rat extends ExceptionMethOverridingDemo
{
        public void Cat() throws StringIndexOutOfBoundsException
        {
            
        }
}
