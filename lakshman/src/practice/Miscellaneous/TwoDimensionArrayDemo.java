package practice.Miscellaneous;

public class TwoDimensionArrayDemo 
{
    public static void main(String[] args) 
    {

        //int[][] c;
        
        int[][] a = new int[3][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        a[2][0] = 7;
        a[2][1] = 8;
        a[2][2] = 9;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

        int[][] b = new int[][]{{10,20,30},{40,50,60,70},{80,90,100,110,120}};

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
