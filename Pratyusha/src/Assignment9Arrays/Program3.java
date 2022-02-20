package Assignment9Arrays;

public class Program3 
{
    public static void main(String[] args) {
        int array[] = {1,2,3};
        int k = array[0];
        for(int i = 0; i < array.length-1; i++)
        {
            array[i] = array[i+1];
        }
        array[array.length-1] = k;

        for(int i : array)
        {
            System.out.println(i+" ");
        }
    }
}
