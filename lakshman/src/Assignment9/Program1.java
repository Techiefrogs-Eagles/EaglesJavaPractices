package Assignment9;

public class Program1 
{
    public static void main(String[] args) 
    { 
        int array1[] = {1,2,3,4,5};
        int array2[] = array1;
 
        for(int i : array2)
        {
            System.out.println(i);
        }   
    }
}
