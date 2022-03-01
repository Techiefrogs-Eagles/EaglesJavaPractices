package assignment10;

public class program11 {
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        try
        {
          System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
          System.out.println(arr[3]);
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
        } 
    }
    
}
