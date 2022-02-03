package Basicpractises;
import java.util.Scanner;
public class Naturalnumber {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        sc.close();
        while (i<=n)
        {
            System.out.println(i);
            i++;
        }

    }
}
