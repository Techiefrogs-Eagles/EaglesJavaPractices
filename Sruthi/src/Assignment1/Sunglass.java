package Assignment1;

public class Sunglass {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1; i < n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = i; j < n; j++){ // by using < and not <= n,we reduce one column to get executed to acheive peak shape at bottom
                System.out.print("*");
            }
            for(int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = 1; i <= n; i++) 
        {
            for(int j = i; j <= n; j++){ 
            
                System.out.print(" "); 
            }
            for(int j = 1; j < i; j++){ // here dont give <=, coz we will not get peak shape at top, so we have to reduce a column

                System.out.print("*");
            }
            for(int j = 1; j <= i; j++){

                System.out.print("*");
            }
                System.out.println(); 
        } 
    }
    }

