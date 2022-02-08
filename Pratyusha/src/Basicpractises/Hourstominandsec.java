package Basicpractises;
/*
    Accept Hours, Convert into minutes and seconds ?
    Enter Hours : 1
    Minutes : 60
    Seconds : 3600
    */

import java.util.Scanner;
public class Hourstominandsec {
    public static void main(String[] args) {
        int hrs,sec,min;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hours:");
        hrs=sc.nextInt();
        min=hrs*60;
        sec=hrs*60*60;
        sc.close();
        System.out.println("Miniutes:"+ min);
        System.out.println("Seconds:" + sec);


    }
}
