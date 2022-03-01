package Assignment9;

public class Program33 {

    public static void main(String[] args) {
        int[][] a = {{1,2},{1,2,3},{1,2,3,4}};
        int[][] b = {{1,2},{1,2,3},{1,2,3,4}};
        int k = a.length;
        int[][] c = new int[k][a[k-1].length];

        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                c[i][j] = a[i][j]*b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
