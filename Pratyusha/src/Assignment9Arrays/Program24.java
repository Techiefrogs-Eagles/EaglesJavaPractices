package Assignment9Arrays;

public class Program24 {
    
    public static void main(String[] args) 
    {
        int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
  
        int b = 0;

        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a[i].length;j++)
            {
                if(a[i][j]==0)
                {
                    b++;
                }
            }
        }
        if(b>(a.length*a.length)/2)
        {
            System.out.println("It is a Sparse Matrix :");
        }
        else
        {
                System.out.println("It is not a Sparse Matrix :");
        }



    }
}
