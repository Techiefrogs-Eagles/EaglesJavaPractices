public class assignment2 
{
    public static void main(String[] args) 
    {
       // assignment2.code1();
      //  assignment2.code2();
      //  assignment2.code3();
         assignment2.code4();
        //  assignment2.code5();
    }

    static void code1()
    {
        int star = 1;
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 5; j >= 1; j--) 
            {
                if (j==star)
                {
                    System.out.print("*");
                    star = star+1;
                    continue;
                }
                System.out.print(j);    
            }
            System.out.println();
        }
    }

    static void code2()
    {

    }

    static void code3()
    {
        int rows = 4;
        int zeros = rows+rows+1;
        int place = rows;
        int star = 1;
        int gap = rows+rows+rows-1;
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= zeros; j++) 
            {
                if(j==star)
                    {
                        System.out.print("*");
                        star = star+place;
                        continue;
                    }
                System.out.print("0");
            }
            System.out.println();
            star = star-gap;
            gap = gap - 3;
            place = place-1;    
        }
    }

    static void code4()
    {
        int rows = 10;
        for (int i = 1;i<=rows;i++)
        {
            for (int j = 1;j<=i;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

    static void code5()
    {
        int rows = 4;
        int space = rows+1;
        int place = 1;
        for (int i = 1;i<=rows;i++)
        {
            for (int j = 1;j<=i;j++)
            {
                if (j==place)
                place = place + space ;
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
