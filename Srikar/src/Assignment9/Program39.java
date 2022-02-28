package Assignment9;

public class Program39 {

    public static void main(String[] args) 
    {
        int a[][]={{9,8,7,6},{5,4,3,2},{1,2,3,4},{5,6,7,8}};
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
