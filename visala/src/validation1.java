package src;

import java.util.Scanner;


public class validation1 {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        if(sc.hasNextInt())
        {
            i=sc.nextInt();
            if(i>0)
            System.out.println(" you Enetred a positive number" +i);
            else{
                System.out.println("you enter a negative number" +i);
            }
        }
          else

            {
                System.out.println("Pleasa enter the valid number");
                
            }
            }
        
    }
