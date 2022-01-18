package Assignment2;

public class pattern37 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1,p='E';j<=n;j++,p--){
                if (j==1 || i==1)
                    System.out.print("E");
                else
                System.out.print((char)p+ "");
            }
            System.out.println();
        }
    } }  
    
}
