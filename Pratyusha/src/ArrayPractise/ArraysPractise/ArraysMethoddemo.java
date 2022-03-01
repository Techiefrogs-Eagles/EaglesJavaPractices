package ArrayPractise.ArraysPractise;

public class ArraysMethoddemo 
{
    public static void main(String[] args) 
    {
        
    int array1[] = {10,100,500};
    ArraysMethoddemo arobj = new ArraysMethoddemo();
    int array2[] = arobj.method(new int[]{1,2,3});
    for(int i : array2)
        {
           System.out.print(i+" ");
        }
        System.out.println();

        for(int i : array1)
        {
            System.out.print(i+" ");
        }
        System.out.println();



     }

     int[] method(int[] a)
     {
         return a;
     }
       
}    
