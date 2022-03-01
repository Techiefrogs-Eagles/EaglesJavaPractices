package CustomDemo;

public class CustomUncheckedDemo extends RuntimeException
{
    CustomUncheckedDemo(String s)
    {
        super(s);
    }
}
  class Demo2
  {
      static void Display()
      {
          throw new CustomUncheckedDemo("HEllo");
      }
      public static void main(String[] args)
      {
         try
         {
              Demo2.Display();
         }
            catch(CustomUncheckedDemo cu)
         {
             System.out.println("Exception cleared");
             System.out.println(cu.getMessage());
         }
      }
}
