package Assignment1;

import java.util.Scanner;

public class SwapTwoNos {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter X and Y value:" );
        int X = object.nextInt();
        int Y = object.nextInt();
        object.close();

        System.out.println("Before swap");
        System.out.println("X = " +X);
        System.out.println("Y = " +Y);
        System.out.println("After Swap");
        int Temp = X;
        X = Y;
        Y = Temp;
        System.out.println("X = " +X);
        System.out.println("Y = " +Y);
    }
    
}
