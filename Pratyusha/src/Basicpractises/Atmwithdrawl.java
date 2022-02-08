package Basicpractises;

import java.util.Scanner;
import java.lang.Thread;

public class Atmwithdrawl {
    public static void main(String[] args) throws InterruptedException {
        int pin = 9797;
        double bal = 50000;
        String act = "savings";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Pin:");
        int upin = input.nextInt();
        if(upin==pin) {
            System.out.println("Welcome to DIVYA Bank.....");
            System.out.println("Enter Account Type[Savings/Current]:");
            String uact = input.next().toLowerCase();
            if(uact.equals(act)) {
                System.out.println("Enetr Amount:");
                double ubal = input.nextDouble();
                if(ubal<=bal) {
                    System.out.println("Processing.....please wait");
                    Thread.sleep(5000);
                    System.out.println("Collect Money");
                    System.out.println("Available Balance:" + (bal-ubal));
                }else {
                    System.out.println("Insufficient Balance,Select Less balance");
                    System.out.println("Availavle Balance:"+bal);
                }
            }else{
                System.out.println("You dont have :"+uact+" with our bank.");
            }
        }else {
            System.out.println("Invalid PIN,Please Try again");
        }
        input.close();
    }
    
}
