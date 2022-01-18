package Assignment1;

public class FullPyramidUsingNumbers {
    public static void main(String[] args) {
        int n = 5;
   
        for(int i = 1; i <= n; i++) 
        {
            for(int j = i; j <= n; j++){ 
            
                System.out.print(" "); 
            }
            for(int j = 1; j < i; j++){ // here dont give <=, coz we will not get peak shape at top, so we have to reduce a column

                System.out.print(" " +i);
            }
            for(int j = 1; j <= i; j++){

                System.out.print(" " +i);
            }
                System.out.println(); // To print in Nxt line
        } 
    }
    
}
