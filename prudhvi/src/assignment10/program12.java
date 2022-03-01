package assignment10;

public class program12 {
    public static void main(String[] args) {
        try
        {
            ClassNotFoundException ce=new ClassNotFoundException("Class Not Found Exception");
            throw ce;
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println("Exception cleared");
        }
    }
    
}
