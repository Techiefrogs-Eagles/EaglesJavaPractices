package Assignment9Arrays;

public class Program32 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,1},{3,3,3}};  
        int b[][] = {{3,3},{1,1,1}};   
        
        int k = a.length;

        int c[][] = new int[k][a[k-1].length];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
               c[i][j] = a[i][j] + b[i][j];
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
           /* for(int i = 0; i<c.length;i++)
            {
                for(int j=0;j<c[i].length;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }*/
            
        }
}
