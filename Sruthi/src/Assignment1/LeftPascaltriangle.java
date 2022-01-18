package Assignment1;

public class LeftPascaltriangle {
    public static void main(String args[]) 
    { 
    // Increasing triangle pattern
       int n = 10;
       for(int i = 1; i<n; i++){      // this remains same, the only difference is we give < instead of <= to attain peak
           for(int j = i; j<=n; j++){ // loop here runs from i to n
               System.out.print("  "); // to print space before star
           }
           for(int j = 1; j<=i; j++){ // loop here runs from 1 to i for increasing triangle
                System.out.print("* ");
           }
           System.out.println();
       }
       //decreasing triangle pattern appended
       for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
            System.out.print("  "); // to print space before star
            }
            for(int j = i; j<=n; j++){ // loop here runs from i to n for decreasing
             System.out.print("* ");
            }
            System.out.println();
        }
    }
    
} 
     

    



