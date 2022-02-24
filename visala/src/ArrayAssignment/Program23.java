package src.ArrayAssignment;

public class Program23 {
    public static void main(String[] args) {
        
        int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
  
        int temp = 0;

        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a[i].length;j++)
            {
                if(i==j&&a[i][j]==1 || i!=j&&a[i][j]==0)
                {
                    temp++;
                }
            }
        }
        if(temp==a.length*a.length)
        {
            System.out.println("It is a identity Matrix :");
        }
        else
        {
                System.out.println("It is not an identity Matrix :");
        }



    }
    
}
