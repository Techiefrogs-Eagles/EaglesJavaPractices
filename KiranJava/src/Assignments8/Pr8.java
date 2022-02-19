package Assignments8;
public class Pr8 {
    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          System.out.println("is numeric");
          return true;
          
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
    public static void main(String[] args) {
        String str ="123sf4";
        System.out.println(isNumeric(str));
    } 
}
