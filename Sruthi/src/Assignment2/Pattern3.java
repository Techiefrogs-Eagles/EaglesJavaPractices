package Assignment2;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1; i<=n; i++){
           int p='A';
            for(int j=1; j<i; j++){ // < for peak
                System.out.print((char)p++ + " "); // typecasting character
                }
            System.out.println();
            }
      //Decreasing pattern     
            for(int i=1; i<=n; i++){
                int p='A';
                 for(int j=i; j<=n; j++){
                     System.out.print((char)p++ + " "); // typecasting character 
                     }
                 System.out.println();
                 }
    }
    
}
