package src.Revision;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.next();
        sc.next();
        sc.nextLine();
        System.out.println("age");
        int age = sc.nextInt();

        System.out.println("NAme: " + name);
        System.out.println("Age: " + age);

    }
}