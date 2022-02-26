package src.Practice1.Exceptionpractice;

public class UnCheckedExceptionHandling extends RuntimeException{
    public UnCheckedExceptionHandling(String s){
        super(s);
        
     }
}
class Driverclass1
{
    static void Display()
    {
        UnCheckedExceptionHandling Uobj=new UnCheckedExceptionHandling("Good Morning");
        throw Uobj;
    }
    public static void main(String[] args)
    {
       try
       {
            Driverclass1.Display();
       }
          catch(UnCheckedExceptionHandling un)
       {
           System.out.println("Exception cleared");
           System.out.println(un.getMessage());
       }
    }
}