package src.ArrayAssignment;

public class Program36 {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2}};
        int b[][]={{2,2,2},{1,1,1}};
      

        int d[][]=new int[2][3];
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
              
                d[i][j]=a[i][j]+b[i][j];
                System.out.print(d[i][j]+" ");
       
            }
               System.out.println();
    
        }
    }
}

