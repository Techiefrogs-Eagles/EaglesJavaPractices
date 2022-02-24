package src.ArrayAssignment;

public class Program39 {
    public static void main(String[] args) {
        
    
    int a[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
       
       
    System.out.println("Given matrix is ");
    for (int i = 0; i < a.length; i++)
     {
        for (int j = 0; j < a.length; j++)
         {

            System.out.print(a[i][j]+" ");
        }
        System.out.println();
        
    }
    System.out.println("Transpose matrix is ");
   
    for (int i = 0; i < a.length; i++)
     {
        for (int j = 0; j < a.length; j++)
         {
            int b[][]=new int[a.length][a.length];
                b[i][j]=a[j][i];
            System.out.print(b[i][j]+" ");
        }

        System.out.println();
    }

}

}

    

