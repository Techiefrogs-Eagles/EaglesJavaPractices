package src.ExceptionAssignment;

public class Program20 {
    public static void main(String[] args) {
        String str="ABC";
      try{
          int a1=Integer.parseInt(str);
      }catch(NumberFormatException n1)
      {
          str="123";
          int a1=Integer.parseInt(str);
          System.out.println(a1);

      }
    }
    
}
