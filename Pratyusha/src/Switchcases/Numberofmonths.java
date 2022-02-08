package Switchcases;

import java.util.Scanner;

public class Numberofmonths {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.close();

       int daysinMonth = 0;
       String MonthName = "Invalid";

       System.out.println("Enter the month number: ");
       int month = sc.nextInt();

       System.out.println("Enter the Year:");
       int Year = sc.nextInt();

       switch(month) {
            
        case 1 :
        MonthName = "January";
        daysinMonth = 31;   
        break;

        case 2:

        MonthName = "February";
        if ((Year % 400 == 0) || ((Year % 100 != 0) && (Year % 4 == 0))) {
            daysinMonth = 29;
            break;
        } else {
            daysinMonth = 28;
            break;
        }

        case 3:
        MonthName = "March";
        daysinMonth = 31;   
        break;

        case 4:
        MonthName = "April";
        daysinMonth = 30;   
        break;

        case 5:
        MonthName = "May";
        daysinMonth = 31;   
        break;

        case 6:
        MonthName = "June";
        daysinMonth = 30;   
        break;

        case 7:
        MonthName = "July";
        daysinMonth = 31;   
        break;

        case 8:
        MonthName = "August";
        daysinMonth = 31;   
        break;

        case 9:
        MonthName = "September";
        daysinMonth = 30;   
        break;

        case 10:
        MonthName = "October";
        daysinMonth = 31;   
        break;

        case 11:
        MonthName = "November";
        daysinMonth = 30;   
        break;

        case 12:
        MonthName = "December";
        daysinMonth = 31;   
        break;
        


       }
      System.out.println(MonthName+"  "+Year+"  "+"has"+"  "+ daysinMonth + "days\n");
 
   } 
}
