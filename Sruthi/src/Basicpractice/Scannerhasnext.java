package Basicpractice;

import java.util.Scanner;
//import java.util.regex.Pattern;
public class Scannerhasnext {
    public static void main(String[] args) {
        String s = "welcome to hasnext! 4 / 4.1 = 1";
        Scanner scan = new Scanner(s); // instead of (s) we can also give(System.in). there are various input stream
        
// boolean hasNext()
        /*System.out.println("" +scan.hasNext()); // hasNext chks if scanner has a token -->if yes returns true
        System.out.println("" + scan.nextLine()); // it prints the remaining string
        System.out.println("" + scan.hasNext());// here it chks if scanner has a token after printing the line
        */
//  boolean hasNext(string pattern)

       /* System.out.println("" +scan.hasNext("to"));
        System.out.println("" +scan.hasNext("welcome"));
        System.out.println("" +scan.nextLine()); */

// boolean hasNextBigDecimal()

      /*  while(scan.hasNext())
        {
            System.out.println("" +scan.hasNextBigDecimal()); //chks if the token is BigDecimal and returns true or false
            System.out.println("" +scan.next());
        } */

// boolean hasNextBigInteger()

       while(scan.hasNext())
        {
            System.out.println("" +scan.hasNextBigInteger()); //chks if the token is BigDecimal and returns true or false
            System.out.println("" +scan.next());
        }

// delimiter pattern
        //System.out.println("" + scan.delimiter());

// findInLine(Pattern pattern)

       /* System.out.println("" +scan.findInLine(Pattern.compile(".ome"))); 
        System.out.println("" +scan.nextLine());  */
        
// findInLine(String pattern)

       /* System.out.println("" +scan.findInLine("hasNext")); 
        System.out.println("" +scan.nextLine());  */


        scan.close();       
        
    }
    
}
