package Assignment9;

public class Program24 {
    public static void main(String[] args) 
    {
        int[][] a = {{1,0,0},{0,0,1},{10,20,1}};
        int temp = 0;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                if(a[i][j]==0)
                {
                    temp++;
                }
            }
        }
        if(temp > ((a.length*a.length)/2)){
        System.out.println("it is a sparse matrix");
        }
        else
        {
            System.out.println("it is not a sparse matrix");
        }
    }
}
