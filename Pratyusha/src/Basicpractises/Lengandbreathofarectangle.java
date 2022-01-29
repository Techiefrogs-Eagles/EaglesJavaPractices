package Basicpractises;

/*
    Accept length and breath of a rectangle and calculate area and perimeter?
    Enter Length and Breath : 4 5
    Area : 20
    Perimeter: 18
    */
import java.util.Scanner;
public class Lengandbreathofarectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float l,b,a,p;
        System.out.print("Enter the length: ");
        l = sc.nextFloat();
        System.out.print("Enter the Breath:");
        b = sc.nextFloat();
        a=l*b;
        p=2*(l+b);
        sc.close();
        System.out.println("Area = "+a);
        System.out.println("Perimeter="+p);
    }
    
}
