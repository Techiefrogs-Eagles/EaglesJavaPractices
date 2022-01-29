package Basicpractises;

/*
    Accept side value of a Square and calculate area and perimeter?
    Enter side value : 3
    Area :9
    Perimeter: 12
    */
import java.util.Scanner;
public class Sideofasquare {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            float side,a,p;
            System.out.print("Enter side value: ");
            side = sc.nextFloat();
            a=side*side;
            p=4*side;
              sc.close();
        System.out.println("Area = "+a);
        System.out.println("Perimeter="+p);
    
    }
    }

