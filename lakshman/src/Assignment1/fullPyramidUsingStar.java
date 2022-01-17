package Assignment1;

public class fullPyramidUsingStar {
    public static void main(String[] args) {
        int rows = 10;
            int till = rows+rows-1;
            int space = rows+rows-2;
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
                    System.out.print("* ");
                }
                System.out.println();
                space=space-2;
            }
    }
}
