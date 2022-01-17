//import java.io.Closeable;
import java.util.Scanner;

public class validation {
    public static void main(String[] args) 
    {
     //  scanner scan=new scanner(System.in);
     //   int num;
     //   num=validate(scan);
     //   int k=validate(scan);
 //   System.out.println("my vale is "+num);
 //   scan.close();
       
   static int validate(Scanner scan)
    {
        int num;
        do{
            System.out.println("enter the positive value");
            while(!scan.hasNextInt())
            {
                System.out.println("this is not a nummber.please enter the valid number");
                scan.next();

            }
            num=scan.nextInt();

        }
        while(num<=0);
        return num;  

    
}
}
}
