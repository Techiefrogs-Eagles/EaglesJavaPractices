package practice;
import java.util.Scanner;

public class scannerpractice {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String s1 = object.next(); 
    
        System.out.println("Enter your Last Name: ");
        String s2 = object.next();
    
        System.out.println("Enter Age: ");
        int age = object.nextInt();
    
        System.out.println("Blood Group: " );
        char ch = object.next().charAt(0);
        String s3 = object.next();
    
        System.out.println("Phone no: " );
        long PhoneNo = object.nextLong();
        
        System.out.println("Thank you " +s1+ " " +s2+ " you are "+age+ " years old "+ "and your blood group is " +ch+s3+ " we will contact you on "+PhoneNo);
        
        object.close();
}
}
