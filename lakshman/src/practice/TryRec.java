package practice;

import java.util.Scanner;

public class TryRec 
{
    public static void main(String[] args) 
    {        
        try (Scanner scan = new Scanner(System.in);) 
        {  //TRY(RESOURCES)
            int a = scan.nextInt(); 
            System.out.println(a/0);
        } 
        catch (Exception e) 
        {
            int a = 10; 
            System.out.println(a);
            throw e; // exception rethrow
        }
    }
}
