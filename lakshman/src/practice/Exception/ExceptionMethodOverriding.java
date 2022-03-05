package practice.Exception;

import java.io.IOException;

class NewException extends IOException
{
    NewException(String s)
    {
        super(s);
    }
}
public class ExceptionMethodOverriding
{
    void display() throws ArrayIndexOutOfBoundsException
    {
        throw new ArithmeticException("Hello NewException");
    }
}
class c1 extends ExceptionMethodOverriding
{
    public void display() throws ArrayIndexOutOfBoundsException
    {
        
    }
}
/*class c2 extends ExceptionMethodOverriding
{
    public void display() throws Exception
    {
        
    }
}*/
