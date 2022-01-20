package Basicpractice;

import java.util.Scanner;

public class Delimiter {
// The default delimiter is white space, but we can change the delimiter using " useDelimiter"
// refer line 11 on how to change the delimiter 
    public static void main(String[] args) {
        String str = " I love to Sing & draw";
        Scanner scan = new Scanner(str);
        scan.useDelimiter("&"); // it displays the string value till &,in line 9.
        System.out.println(""+ scan.next());
        scan.close();
    }
}
