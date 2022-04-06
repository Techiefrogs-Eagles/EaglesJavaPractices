package practice.Miscellaneous;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class abc {
}

class Main {

    public static final String REG_EXP_CHAR_ONLY = "(?=.*?[a-zA-Z0-9 ])";

    public static String LongestWord(String sen) {

        StringBuilder strBuffer = new StringBuilder();
        for (String c : sen.split("")) {
            //System.out.println("c--------->" + c);
            if (isValid(c)) {

                strBuffer.append(c);

            }
        }
        
        return Arrays.stream(strBuffer.toString().split(" ")).max(Comparator.comparingInt(String::length))
                .orElse(null);
    }

    public static boolean isValid(String c) {
        // System.out.println("char -->" + c);
        Pattern pattern = Pattern.compile(REG_EXP_CHAR_ONLY);
        Matcher matcher = pattern.matcher(c);
        // System.out.println("Match found");
        return matcher.find();
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine()));
    s.close(); 
  }

}