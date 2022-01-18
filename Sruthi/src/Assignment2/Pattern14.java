package Assignment2;

public class Pattern14 {
    public static void main(String[] args) {
        int n=6;
        for(int i = 1; i <= n; i++){
            int p = 'A';
            for(int j = 1; j < i; j++){ 
                System.out.print((char)p+++"");
                }
            for(int j = 1; j <= i; j++){
                System.out.print((char)p--+"");
                }
                System.out.println(); 
        }  
        
    }
}
