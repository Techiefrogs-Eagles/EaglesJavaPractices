package practice;

public class CheckedDemo extends Exception
{
    CheckedDemo(String s)
    {
        super(s);
    }
}
  class SampleClass1
  {
      static void Display() throws CheckedDemo
      {
          throw new CheckedDemo("HEllo");
      }
      public static void main(String[] args)
      {
         try
         {
              SampleClass1.Display();
         }
            catch(CheckedDemo cu)
         {
             System.out.println("Exception cleared");
             System.out.println(cu.getMessage());
         }
        }
    }
