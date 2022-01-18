package Assignment2;

public class Pattern17 {
    public static void main(String[] args) {
        int n=6;
    //Decreasing Pattern
        for(int i=1,k='A';i<=n;i++,k++){
            int p=k;
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++) {
                System.out.print((char)p+++"");
            }  
            System.out.println();
            }
    //Increasing Pattern
    for(int i=1,k='F';i<=n;i++,k++){
        int p=k;
        for(int j=i;j<=n;j++){
            System.out.print(" ");
        }
        for(int j=i;j<=n;j++) {
            System.out.print((char)p+++"");
        }  
        System.out.println();
        }  
          
    }
}
    

