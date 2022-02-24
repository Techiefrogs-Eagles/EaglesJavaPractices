package Assignment9Arrays;

public class Program22 
{
    public static void main(String[] args) 
    {
        int a[][] = {{6,6,6},{5,5,5}};
        int b[][] = {{3,3,3},{1,1,1}};

        int c[][] = new int[2][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<3;j++)
            {
               c[i][j] = a[i][j] - b[i][j];
            }
        }
            for(int i = 0; i<c.length;i++)
            {
                for(int j=0;j<c[i].length;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            
        }


}
