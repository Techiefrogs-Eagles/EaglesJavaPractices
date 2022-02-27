package src.Practice1.Exceptionpractice;

public class UserDefiendChainingException extends Exception{
  public UserDefiendChainingException(String s){
  super(s);

  }
}
 class UserDefiendChainingException1 extends Exception{
    public UserDefiendChainingException1(String s){
    super(s);
  
    }
  }
  

class ExceptionChaining
{

    static void method() 
    {
      try{
          throw new UserDefiendChainingException("Hello");

        }
        catch(UserDefiendChainingException ue)
        {
            System.out.println("Exception cleard");
               System.out.println(ue.getMessage());

        }
    }

    public static void main(String[] args) throws UserDefiendChainingException {
        ExceptionChaining.method();
    }
}


