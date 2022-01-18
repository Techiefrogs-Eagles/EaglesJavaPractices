import java.util.Scanner;
public class scannerdemo2{
    public static void main(String[] args) {
        String str ="hello 536 knighnt rider,This is our step-1 program&";
        Scanner scannerobj=new Scanner(str);
        scannerobj.useDelimiter(",");
        System.out.println("1"+scannerobj.next());
        System.out.println("2"+scannerobj.next());
        System.out.println("3"+scannerobj.next());
        System.out.println("4"+scannerobj.next());
        scannerobj.close();

    }
}
