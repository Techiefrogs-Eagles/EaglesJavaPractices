package practice.Miscellaneous;
public class csloops 
{
    public static void main(String[] args) 
    {
     // traditional for loop
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }


     // nested for loop, labeled for loop
     
     for(int i=5;i>=1;i--)
        {
            //System.out.println();
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("1 ");
                
            }
            System.out.println();
            

           // System.out.println();
        }

        // while loop
        int i=5;
        while(i >=1)
        {
            if(i==3)
            {
                i--;
                continue;
            }
            System.out.println("its working  "+i);
            i--;
        }

        // do while loop
        i=1;
        do
        {
            if (i==3)
            {
                i++;
                continue; 
            }

            System.out.println("its working again  "+i);
            
           
            i++;
            
        }while(i <= 5);
        
        
    }

}
