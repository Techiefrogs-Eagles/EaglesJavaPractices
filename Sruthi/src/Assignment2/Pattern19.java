package Assignment2;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1,k = 'F'; i <= n; i++,k--) {
          
            for(int j = i; j <= n; j++){ 
            System.out.print(" "); 
            }
            int p = k;
            for(int j = 1; j <= i; j++){ 
            System.out.print((char)p+++" ");
            }
            System.out.println();
        } 
    }
}
