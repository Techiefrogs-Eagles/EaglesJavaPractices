package Assignment2;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i <= n; i++){
            int p = 'A';
            for(int j = i; j <= n; j++){ 
                System.out.print(" "); 
                }
            for(int j = 1; j < i; j++){ // here dont give <= to reduce a column
                System.out.print((char)p+++"");
                }
            for(int j = 1; j <= i; j++){
                System.out.print((char)p--+"");
                }
                System.out.println(); // To print in Nxt line
        }  
    }
    
}
