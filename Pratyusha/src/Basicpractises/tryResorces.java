package Basicpractises;

import java.util.Scanner;

public class tryResorces 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        try(scan;sc)
        {
            System.out.println("Hello All");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Welcome");
        }
        /*finally
        {
             scan.close();
        }*/

    }
}
