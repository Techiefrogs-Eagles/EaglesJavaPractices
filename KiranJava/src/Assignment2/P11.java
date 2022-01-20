public class P11 {
    public static void main(String[] args) {
        int i,j,n=6,sum=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                for(i=j;i>=1;i--)
                   {  sum=sum+i;}
                   System.out.print(sum);
            }
        }

    }
}
