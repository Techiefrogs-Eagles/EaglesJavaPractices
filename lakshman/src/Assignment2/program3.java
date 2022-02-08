package Assignment2;

public class program3 
{
    public static void main(String[] args) 
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
}
