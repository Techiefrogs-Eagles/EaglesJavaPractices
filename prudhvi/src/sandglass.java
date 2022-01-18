public class sandglass {

public static void main(String[] args) {
    int n=10;
    for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n+1;i++)
        {
            for(int j=i;j<n+1;j++)
            {
            System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++)
            {
                System.out.print("*");
            }
            System.out.println();
         }

}
    
}
