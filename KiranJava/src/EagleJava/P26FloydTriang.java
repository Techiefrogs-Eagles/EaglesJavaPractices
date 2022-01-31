package EagleJava;public class P26FloydTriang {
    public static void main(String[] args) {
        int n=4,p=1,i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }
}
