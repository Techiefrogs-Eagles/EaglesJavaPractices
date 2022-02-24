package Assignment9;

public class Program31 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int b[][]=new int[a.length][a[0].length];

        System.out.println("Transpose of the matrix is ");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                    b[i][j]=a[j][i];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
