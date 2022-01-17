import java.util.Scanner;

public class practice 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
          while(!scan.hasNextInt())
          {
            scan.next();
            System.out.println("wrong INPUT try again");
        }
        int num = scan.nextInt();
        while (num < 0 ) 
        {
            System.out.println("your number must be positive");
            scan.next();
        }
        
        
        System.out.println("The number is "+num);   
        scan.close();

    }
}
