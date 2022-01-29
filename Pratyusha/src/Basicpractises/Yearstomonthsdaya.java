package Basicpractises;

/*
Accept years and covert into months and days?
Enter years : 1
Months :12
Days : 365
*/
import java.util.Scanner;
public class Yearstomonthsdaya {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Year:");
    int year = sc.nextInt();
sc.close();
    System.out.println("Months :" +year*12);
    System.out.println("Days:"+year*365);

}
    
}
