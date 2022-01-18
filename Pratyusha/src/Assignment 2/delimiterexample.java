import java.util.*;

public class delimiterexample {

   public static void main(String[] args) {

      String s = "Hello World!";

      // create a new scanner with the specified String Object
      Scanner scanner = new Scanner(s);

      // print the next line of the string
      System.out.println("" + scanner.nextLine());

      // print the delimiter this scanner is using
      System.out.println("" + scanner.delimiter());

      // close the scanner
      scanner.close();
   }
}

