package src.Practice1;

public class ArrayTwoDimention {

    public static void main(String[] args) {
        
    int a[][]=new int[3][3];
    a[0][0]=1;
    a[0][1]=2;
    a[0][2]=3;
    a[1][0]=4;
    a[1][1]=5;
    a[1][2]=6;
    a[2][0]=7;
    a[2][1]=8;
    a[2][2]=9;
    for (int i = 0; i < a.length; i++)
     {
      for (int j = 0; j < a.length; j++) 
      {
          System.out.print(a[i][j]+"  ");
          
      }
      System.out.println();
    }
    int b[][]={{1,1,1},{2,2,2},{3,3,3}};

    for (int i = 0; i < b.length; i++) 
    {

        for (int j = 0; j < b.length; j++)
         {
            System.out.print(b[i][j]+" ");
            
        }
        System.out.println();
        
    }
   int c[][]={{1,2},{3,4,5},{6,7,8,9}};
   for (int i = 0; i < c.length; i++) 
   {
       for (int j = 0; j < c[i].length; j++)
        {
           System.out.print(c[i][j]+" ");
       }
       System.out.println();
   }
   int d[][]=new int[][]{{0,0,0},{1,1,1,1},{2,2,2,2}};
   for (int i = 0; i < d.length; i++) {
       for (int j = 0; j < d[i].length; j++) {
           System.out.print(d[i][j]+" ");
        
       }
       System.out.println();
       
   }
   System.out.println(d.getClass().getName());
   

    }
}
