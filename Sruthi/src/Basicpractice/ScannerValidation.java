package Basicpractice;

import java.util.Scanner;

public class ScannerValidation {
    public static void main(String[] args) {

// validates if the given no is integer. if not, it asks the end user to give integer value   
      
  /*      Scanner obj = new Scanner(System.in);
        System.out.println("Please enter an Integer number");

        while (!obj.hasNextInt()) {
            System.out.println("What u entered is not an integer");
            obj.next();
        }
        int num = obj.nextInt();
        System.out.println(num + " what u entered is an Integer number");
        obj.close(); */

// validates if the given no is positive integer. if not it aks the end user to give positive integer value   
// using do while

       Scanner obj = new Scanner(System.in);
       int num;
       do{  
            System.out.println("Please enter a positive number");
            while (!obj.hasNextInt()) 
            {
                System.out.println("What u entered is not a positive number");
                obj.next();
            }
            num = obj.nextInt();
        } while (num<=0); // chking if the entered no is positive or negative
            System.out.println(num + " what u entered is positive number"); 
            obj.close(); 

    }
    
}
