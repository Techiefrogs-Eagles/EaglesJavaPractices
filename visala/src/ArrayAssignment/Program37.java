package src.ArrayAssignment;

public class Program37 {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
      

        int d[][]=new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
              for(int k = 0;k < 3; k++)
              {
                
                d[i][j]+=a[i][k]*b[k][j];
              }
                System.out.print(d[i][j]+" ");
            }
            
               System.out.println();
            
        }
    }
}

    
    

