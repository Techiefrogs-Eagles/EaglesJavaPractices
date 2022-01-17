package Assignment1;

public class HalfPyramidUsingAlpha {
    public static void main(String[] args) 
    {
        for (char p ='A';p<='E';p++)
            {
                for (char b ='A';b <= p;b++)
                {
                    System.out.print(p+" ");
                }
                System.out.println();
            }
    }
}
