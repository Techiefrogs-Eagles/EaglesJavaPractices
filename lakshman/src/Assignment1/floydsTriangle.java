package Assignment1;

public class floydsTriangle {
    public static void main(String[] args) {
        int rows = 4;
            int input=rows;
            int till=0;
            for(int i=1;i<=input;i++) 
            {
                till=till+i;
            }
            int floyd = 1; 
            for (int i = 1;i<=rows;i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print(floyd+" ");
                    floyd = floyd+1;
                }
                System.out.println();
                
            }
    }
}
