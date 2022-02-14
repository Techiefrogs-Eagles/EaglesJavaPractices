package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countw = 1;
        while(scan.hasNext()){
            String a = scan.nextLine();
            System.out.println(countw+" "+a);
            countw++;
        }
    }
}
