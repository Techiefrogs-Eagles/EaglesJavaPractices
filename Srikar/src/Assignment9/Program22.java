package Assignment9;

public class Program22 {
    public static void main(String[] args) {
        int a[][] = {{4,3,4},{1,2,1},{2,1,2}};
        int b[][] = {{3,4,3},{1,3,1},{3,2,1}};
        int c[][] = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                c[i][j] = a[i][j]-b[i][j];
            }
        }

        for (int i = 0; i < c.length; i++) 
        {
            for (int j = 0; j < c[i].length; j++) 
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}