import javax.lang.model.util.ElementScanner14;

public class Largestnumberamongthree {
    public static void main(String[] args)
    {
        int a = 85, b = 150 ,c = 25 ;

        if(a>=b && a>=c)
        {
            System.out.println(a + " is the largest Number");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b + " is the largest Number");
        }
        else {
            System.out.println(c + "is the largest number");
        }
    

    }
    
}
