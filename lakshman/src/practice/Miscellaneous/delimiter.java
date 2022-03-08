package practice.Miscellaneous;
import java.util.Scanner;

public class delimiter {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("and");
        String k = scan.next();
        String p = scan.next();
        System.out.println(scan.delimiter());
        System.out.println(k+p);
        scan.close();
    }
}
