package practice.Exception;

public class UnCheckedDemo extends RuntimeException
{
    UnCheckedDemo(String s)
    {
        super(s);
    }
}
  class SampleClass2
  {
      static void Display()
      {
          throw new UnCheckedDemo("HEllo all");
      }
      public static void main(String[] args)
      {
         try
         {
              SampleClass2.Display();
         }
            catch(UnCheckedDemo cu)
         {
             System.out.println("Exception cleared");
             System.out.println(cu.getMessage());
         }
      }
    }
