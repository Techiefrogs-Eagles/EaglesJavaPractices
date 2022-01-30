package Assignment2;

public class P9 {
    public static void main(String[] args) {
        int n=10,i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
                {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
