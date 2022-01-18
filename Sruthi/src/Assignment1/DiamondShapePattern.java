package Assignment1;

public class DiamondShapePattern {
    public static void main(String[] args) {
        int n = 8;
   
        for(int i = 1; i < n; i++) // here we use only< instead of <= to reduce the column sice we merge the code of full & inverse full pyramid

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
                System.out.println(); // To print in Nxt line
        } 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = i; j < n; j++){ // by using < and not <= n,we reduce one column to get executed to acheive peak shape at top
                System.out.print("*");
            }
            for(int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
