package Assignment1;

public class diamond {
    public static void main(String[] args) {
        int rows = 8;
            int till = rows+(rows-1);
            int space = rows-1;
            for (int i=1;i<=till;i++) 
            {
                if (i%2==0)
                continue;
                for (int k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
                space=space-1;
            }

            int rows0 = rows-1;
            int till0 = rows0+rows0-1;
            int space0 = rows0+rows0-1;
            for (int i=1;i<=till0;i++) 
            {
                if (i%2==0)
                continue;
                for (int k=till0;k<=space0;k++)
                {
                    System.out.print(" ");
                }
                for (int j=till0;j>=i;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
                space0=space0+1;
            }
    }
}
