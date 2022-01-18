package Assignment2;
//Decreasing Pyramid
public class Pattern6 {
    public static void main(String[] args) {
        int n = 6;
           for(int i = 1; i <= n; i++) {
            for(int j = i; j <= n; j++){ 
            System.out.print(" "); 
            }
            for(int j = 1, p = 'A'; j <= i; j++,p++){ 
            System.out.print((char)p+ " ");
            }
            System.out.println(); 
        } 
    }
    }

