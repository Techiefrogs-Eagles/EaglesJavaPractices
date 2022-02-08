package Assignments4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        
        
        Scanner scan=new Scanner(System.in);
        System.out.println("=========Weighted Item============");
        System.out.println("Enter Name, Unit Price, Weight :-");
        WeighedItem w = new WeighedItem();
        w.setData(scan.next(), scan.nextDouble());
        w.setWeight(scan.nextDouble());
        System.out.println(" "+w.toString());
        System.out.println("=========Counted Item============");
        System.out.println("Enter Name, Unit Price, Quantity :-");
        CountedItem c = new CountedItem();
        c.setData(scan.next(), scan.nextDouble());
        c.setQuantity(scan.nextInt());
        scan.close();
        System.out.println(" "+c.toString());
        }
}
