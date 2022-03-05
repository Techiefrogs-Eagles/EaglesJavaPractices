package assignment10;

public class program6 {
    public static void main(String[] args) {
        
        int a=10;
        int b=0;
        try
        {
            System.out.println("In Try ");
            try
            {
                System.out.println("in nested try");
                System.out.println(a/b);
            }
            catch(Exception p)
            {
                b=2;
                System.out.println(a/b);
                System.out.println("in inner catch");
            }
        }
        catch(Exception e)
        {
            System.out.println("In catch");
        }
    }
    
}
