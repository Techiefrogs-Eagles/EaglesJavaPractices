package Assignment9;

public class Program29 {
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int b[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int c[][] = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                for (int j2 = 0; j2 < c.length; j2++) 
                {
                    c[i][j] += a[i][j]*b[j][j2];   
                }
                System.out.print( c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
