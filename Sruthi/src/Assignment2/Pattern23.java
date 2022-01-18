package Assignment2;

public class Pattern23 {
    public static void main(String[] args) {
        int n=6;
        for(int i = 1,p='A'; i <= n; i++,p++) {
            for(int j = i; j <= n; j++){ 
            System.out.print(" "); 
            }
            for(int j = 1; j <= i; j++){ 
            System.out.print((char)p+ " "); //typecasted p to character to avoid ascii value getting displayed
            }
            System.out.println(); // To print in Nxt line
        } 
    }
}
