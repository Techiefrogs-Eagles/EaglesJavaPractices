package Assignment2;

public class pattern6 
{
    public static void main(String[] args) 
    {
        int alpha = 64;
        int rows = 6;
            int till = rows;
            int space = --rows;
            for (int i=1;i<=till;i++) 
            {
                for (int k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++)
                {
                    System.out.print((char)(j+alpha)+" ");
                }
                System.out.println();
                space = space-1;
            }
    }
}
