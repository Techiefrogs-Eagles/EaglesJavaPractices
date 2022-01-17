package Assignment1;

public class RightPascalTraingle {
    public static void main(String[] args) {
        int rows = 5;
            for (int i = 1;i<=rows;i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

            int rows0 = rows-1;
            for (int i = 1;i<=rows0;i++)
            {
                for (int j = rows0;j>=i;j--)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
