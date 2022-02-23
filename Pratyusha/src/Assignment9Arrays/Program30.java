package Assignment9Arrays;

public class Program30 
{
    public static void main(String[] args) 
    {
        int a [][] = {{1,2,1},{2,1,2},{1,3,1}};


        int  sumRows = 0;
        int sumColms = 0;

        for(int i = 0; i < a.length ;i++)
        { 
            sumRows = 0;
           for(int j = 0; j < a[i].length;j++)
           {
                sumRows = sumRows+ a[i][j];
           }
           System.out.println("Sum of rows: "+ sumRows);
        }

       for(int i = 0; i < a.length ; i++)
       {
           sumColms = 0;
           for(int j = 0; j< a[i].length;j++)
           {
              sumColms = sumColms + a[j][i];
           }
           System.out.println("Sum of colums: "+ sumColms);
        }
    }

}
    

