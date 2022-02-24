package Assignment9;

public class Program25 {
    public static void main(String[] args) 
    {
        int a[][] = {{1,2},{1,2,3},{1,2,3,4}};
        int b[][] = {{1,2},{1,2,3},{1,2,3,4}};
        int temp = 0;
        int z= 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) 
        {
            z += a[i].length;
        }
        for (int i = 0; i < b.length; i++) 
        {
            y += b[i].length;
        }
        if(z==y)
        {
            for (int i = 0; i < a.length; i++) 
            {
                for (int j = 0; j < a[i].length; j++) 
                {
                    if((a[i][j]==b[i][j]))
                    {
                        temp++;
                    }
                }
            }
            if(temp == z)
            {
                System.out.println("Given two matrices are equal");
            }
            else
            {
                System.out.println("Given two matrices are not equal");
            }
        }
        else
        {
            System.out.println("Given two matrices are not equal");
        }
    }
}
