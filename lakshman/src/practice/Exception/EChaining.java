package practice.Exception;

class VenkatException extends Exception
{
    public VenkatException(String s, Throwable a)
    {
        super(s ,a );
    }
    public VenkatException(String s)
    {
        super(s);
    }
}
class BhaskarException extends Exception
{
    public BhaskarException(String s ,Throwable a)
    {
        super(s, a);
    }
    public BhaskarException(String s)
    {
        super(s);
    }
}
class VarmaException extends Exception
{
    public VarmaException(String s, Throwable cause)
    {
        super(s , cause);
    }
    public VarmaException(String s)
    {
        super(s);
    }
}
public class EChaining 
{
    void bhaskar() throws BhaskarException
    {
        throw new BhaskarException("Bhaskar is sick");
    }
    void varma() throws VarmaException
    {
        try
        {
            bhaskar();
        }
        catch(BhaskarException Be)
        {
            throw new VarmaException("I will take bhaskar to hospital",Be);
        }
    }
    void venkat() throws VenkatException
    {
        try
        {
            varma();
        }
        catch(VarmaException ve)
        {
            throw new VenkatException("I am alone from kakinada",ve);
        }
    }
    public static void main(String[] args) throws VenkatException
    {
        EChaining obj = new EChaining();
        obj.venkat();
    }
}