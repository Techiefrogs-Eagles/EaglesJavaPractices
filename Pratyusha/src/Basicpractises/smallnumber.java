package Basicpractises;

import java.util.Scanner;
public class smallnumber {
    public static void main(String[] args) {
        int num1 , num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        if(num1<num2)
        {
            System.out.println(num1);
        }
        else if(num2<num1)
        {
            System.out.println(num2);
        }
}
}

