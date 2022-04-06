package src.Practice1.Practice;


import java.util.Scanner;
import java.util.regex.Pattern;
public class string {
    public static void main(String[] args) 
    {
        //String Findnext(pattern,pattern)

        String s = "Hello World! 3 + 3.0 = 6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);
  
       
       // System.out.println("" + scanner.findInLine(Pattern.compile(".orld")));
      // System.out.println("" + scanner.nextLine());
      // scanner.close();

      //String FindLine(String.pattern)

        // find a string "World"
        System.out.println("" + scanner.findInLine("World"));
  
        // print the rest of the string
        System.out.println("" + scanner.nextLine());
  
        // close the scanner
        scanner.close();
    }


}
