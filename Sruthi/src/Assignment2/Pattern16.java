package Assignment2;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 6;
    //Increasing Pyramid
        for(int i = 1; i < n; i++) {
            for(int j = i; j <= n; j++){ 
            System.out.print(" "); 
            }
            for(int j = 1, p = 'A'; j <= i; j++,p++){ //loop runs from 1 to i
            System.out.print((char)p+ " ");
            }
            System.out.println();
        } 
    //Decreasing Pyramid
        for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++){ 
        System.out.print(" "); 
        }
        for(int j = i, p = 'A'; j <= n; j++,p++){ // loop runs from i to n
        System.out.print((char)p+" ");
        }
        System.out.println(); // To print in Nxt line
    }   
    }    
}
