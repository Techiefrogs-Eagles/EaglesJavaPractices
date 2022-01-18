package Assignment1;

public class FullPyramid {
    public static void main(String[] args) {
        int n = 5;
   
        for(int i = 1; i <= n; i++) 
        {
            for(int j = i; j <= n; j++){ 
            
                System.out.print(" "); 
            }
            for(int j = 1; j < i; j++){ // here dont give <=, coz we will not get peak shape at top, so we have to reduce a column

                System.out.print("* ");
            }
            for(int j = 1; j <= i; j++){

                System.out.print("* ");
            }
                System.out.println(); // To print in Nxt line
        } 
    }
        
    
}
