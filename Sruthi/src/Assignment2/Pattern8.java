package Assignment2;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1; i<=n; i++){
           int p='F';
            for(int j=1; j<=i; j++){
                System.out.print((char)p-- + " "); // typecasting character here, otherwise it will print ASCII value of A
                }
            System.out.println();
            }
    }
}
