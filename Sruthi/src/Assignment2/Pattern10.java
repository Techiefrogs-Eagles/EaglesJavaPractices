package Assignment2;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1,p='A';i<=n;i++){
            for(int j=1;j<=i;j++,p++){
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }
    
}
