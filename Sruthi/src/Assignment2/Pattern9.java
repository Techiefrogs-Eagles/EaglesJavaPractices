package Assignment2;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1; i<=n; i++){
           int p='A';
            for(int j=i; j<=n; j++){ 
                System.out.print((char)p++ + " "); // typecasting character here, otherwise it will print ASCII value of A
                }
            System.out.println();
            }
    }
    }
 

