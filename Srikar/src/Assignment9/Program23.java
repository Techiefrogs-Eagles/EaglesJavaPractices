package Assignment9;

public class Program23 
{               
    public static void main(String[] args) 
    //Given matrix is identity matrix are not
    {
        int[][] a = {{1,0,1,0},{0,1,0,1},{1,0,0,1},{0,1,1,0}};
        int temp = 0;
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                if((i==j&&a[i][j]==1)||(i!=j&&a[i][j]==0))
                {
                    temp++;
                }
            }
        }
        if(temp == (a.length*a.length))
        {
            System.out.println("it is an identity matrix");
        }
        else
        {
            System.out.println("it is not an identity matrix");
        }
    }    
}