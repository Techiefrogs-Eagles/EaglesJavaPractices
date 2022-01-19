package Assignment2;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        //using scanner class to read input from user
        Scanner row = new Scanner(System.in);
        System.out.println("Enter the row value:");
        int n = row.nextInt();
        row.close();
        //int n = 6;
        for(int i=1; i<=n; i++){
           int p='A';
            for(int j=1; j<=i; j++){
                System.out.print((char)p++ + " "); // typecasting character here, to avoid ASCII value of A
                }
            System.out.println();
            }
    }
}
        
    

