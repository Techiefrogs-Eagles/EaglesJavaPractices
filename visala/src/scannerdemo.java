package src;

import java.util.Scanner;
public class scannerdemo {
    public static void main(String[] args) {

        
Scanner scannerobj = new Scanner(System.in);


    System.out.println("Enter name,age,salary");
  
    String name = scannerobj.nextLine();


    int age = scannerobj.nextInt();
  
  Float salary = scannerobj.nextFloat();
    
    
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
      System.out.println("Salary: " + salary);
     scannerobj.close();
}
  }
