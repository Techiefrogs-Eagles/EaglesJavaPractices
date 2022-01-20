import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        String st = sc.nextLine();
        System.out.print("Enter AadharNum:");
        int AadharNum =sc.nextInt();
        System.out.print("Enter Age:");
        int age = sc.nextInt();    
        System.out.print("Enter Height:");
        double height = sc.nextDouble();
        System.out.print("Enter Salary:");
        int salary = sc.nextInt();
        {

        System.out.println("Name:" + st);;
        System.out.println("Aadharnum:" + AadharNum);
        System.out.println("Age:" + age);
        System.out.println(" Height:" + height);
        System.out.println("Salary:" + salary);
    }
  }
}
