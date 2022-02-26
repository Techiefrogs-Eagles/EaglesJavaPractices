package src.Practice1.Exceptionpractice;

import java.util.Scanner;

public class TryResources {
    public static void main(String[] args) {
        try(Scanner scan=new Scanner(System.in)){
        int a =scan.nextInt();
        System.out.println(a/0);
        }catch(ArithmeticException Ae)
        {
            int a=20;
            System.out.println(a);
        }
    }
}
