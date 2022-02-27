package Assignment10;

public class Program12 
{
    public static void main(String[] args) 
    {
        try
        {
            ClassNotFoundException cn=new ClassNotFoundException("Class Not Found Exception");
            throw cn;
        }
        catch(ClassNotFoundException cn)
        {
            System.out.println("Exception cleared");
        }
    }
}
