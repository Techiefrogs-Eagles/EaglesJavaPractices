import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("enter the num");
        int i = scannerobj.nextInt();
        String s=scannerobj.nextLine();


        System.out.println( "the given output "+i+" " +s);
        
    }
    
}
