package src.ExceptionAssignment;

public class Program16 {
    public static void main(String[] args) {
        try{
            CloneNotSupportedException CN=new CloneNotSupportedException("Hi");
            throw CN;
        }catch(CloneNotSupportedException CN)
        {
           
            System.out.println("CloneNotSupportexception solved");
        }
        
    }
    
}
