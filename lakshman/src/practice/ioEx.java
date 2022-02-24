package practice;

import java.io.IOException;
import java.util.Scanner;

public class ioEx 
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        try{
            String a = scan.next();
        }catch(Exception h){
            String a = "array";
            System.out.println("scan sample");
        }
    }
}
