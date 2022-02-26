package src.ExceptionAssignment;

public class Program5 {
    public static void main (String args[]) { 
        try {
           throw new Exception("Hello Good Morning");
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
     }
  
}
