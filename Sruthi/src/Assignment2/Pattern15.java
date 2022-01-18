package Assignment2;
//Decreasing Pyramid
public class Pattern15 {
    public static void main(String[] args) {
        int n = 6;
           for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){ 
            System.out.print(" "); 
            }
            for(int j = i, p = 'A'; j <= n; j++,p++){ 
            System.out.print((char)p+" ");
            }
            System.out.println(); 
        } 
    }
}
