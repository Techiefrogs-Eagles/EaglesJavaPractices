package Assignments10;

import java.io.IOException;

public class Pr5 {
    public static void main (String args[]) { 
        try {
           throw new IOException("Hello Good Morning");
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
     }
}
