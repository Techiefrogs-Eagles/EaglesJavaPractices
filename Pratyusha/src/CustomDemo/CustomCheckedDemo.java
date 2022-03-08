package CustomDemo;

public class CustomCheckedDemo extends Exception
{
    CustomCheckedDemo(String s)
    {
        super(s);
    }
}
  class Demo1
  {
      static void Display() throws CustomCheckedDemo
      {
          throw new CustomCheckedDemo("HEllo");
      }
      public static void main(String[] args)
      {
         try
         {
              Demo1.Display();
         }
            catch(CustomCheckedDemo cu)
         {
             System.out.println("Exception cleared");
             System.out.println(cu.getMessage());
         }
      }
  }
