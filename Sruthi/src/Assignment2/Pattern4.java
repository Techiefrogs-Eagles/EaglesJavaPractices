package Assignment2;

public class Pattern4 {
    public static void main(String[] args) {
   //Decreasing triangle pattern 
         int n = 6;
     for(int i=1; i<=n; i++){
        int p='A';
         for(int j=i; j<=n; j++){
             System.out.print((char)p++ + " "); // typecasting character here, to avoid ASCII value of A
             }
         System.out.println();
         }
  //increasing triangle pattern
    for(int i=1; i<=n; i++){
        int p='A';
         for(int j=1; j<=i; j++){ 
         System.out.print((char)p++ + " "); 
         }
        System.out.println();
         }         
    }
    
}
