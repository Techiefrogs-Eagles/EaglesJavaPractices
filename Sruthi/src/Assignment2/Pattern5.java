package Assignment2;

public class Pattern5 {
    public static void main(String[] args) {
        //Decreasing triangle pattern 
        int n = 6;
        for(int i=1,p='F'; i<=n; i++,p++){
           
            for(int j=i; j<=n; j++,p--){ 
                System.out.print((char)p+ " "); // typecasting character here, otherwise it will print ASCII value of A
                }
            System.out.println();
            }}}
    }         
    
    


