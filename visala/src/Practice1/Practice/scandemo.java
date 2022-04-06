package src.Practice1.Practice;

import java.util.Scanner;

public class scandemo {

    public static void main(String[] args) {
       
       
        Scanner scannerobject = new Scanner(System.in) ;
        {
            System.out.println("enter the number");
              int num=scannerobject.nextInt();
      boolean flag = false;
            for (int i = 2; i <= num/2; ++i) 
            {
              if (num % i == 0) 
              {
                flag = true;
                break;
              }
            }
            if (!flag)
              System.out.println(num + " is a prime number.");
            else
              System.out.println(num + " is not a prime number.");
        }
      }
    
    }
