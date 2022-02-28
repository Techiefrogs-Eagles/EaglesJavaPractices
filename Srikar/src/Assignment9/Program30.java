package Assignment9;

public class Program30 {
    public static void main(String[] args) 
    {
        int a [][] = {{9,1,6},{0,1,4},{3,4,3}};
        int  SumOfRows = 0;
        int SumOfColms = 0;

        for(int i = 0; i < a.length ;i++)
        { 
            SumOfRows = 0;
           for(int j = 0; j < a[i].length;j++)
           {
                SumOfRows = SumOfRows+ a[i][j];
           }
           System.out.println("Sum of rows: "+ SumOfRows);
        }

       for(int i = 0; i < a.length ; i++)
       {
           SumOfColms = 0;
           for(int j = 0; j< a[i].length;j++)
           {
              SumOfColms = SumOfColms + a[j][i];
           }
           System.out.println("Sum of colums: "+ SumOfColms);
        }
    }
    
}
