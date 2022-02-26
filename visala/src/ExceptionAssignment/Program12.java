package src.ExceptionAssignment;

public class Program12 {
    public static void main(String[] args) {
        try{
      ClassNotFoundException cl=new ClassNotFoundException("Hello");
      throw cl;
        }
        catch(ClassNotFoundException cl)
        {
            System.out.println("ClassNotFoundException solved");
        }
    }
}
