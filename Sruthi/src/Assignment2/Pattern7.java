package Assignment2;

public class Pattern7 {
    public static void main(String[] args) {
     //Decreasing triangle   
        int n = 6;
        for(int i=1; i<=n; i++){
           int p='F';
            for(int j=i; j<=n; j++){ 
                System.out.print((char)p-- + " "); // typecasting character here, to avoid ASCII value of A getting printed
                }
            System.out.println();
            }
    }
}
