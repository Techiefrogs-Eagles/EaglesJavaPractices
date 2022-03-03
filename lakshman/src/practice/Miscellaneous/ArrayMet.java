package practice.Miscellaneous;

public class ArrayMet 
{
    public static void main(String[] args) 
    {
        String arr1[] = {"hai","hello","namastey","vankkam"};
        ArrayMet obj  = new ArrayMet();
        int arr2[] = obj.method1(new int[]{100,200,300,400,500});
        for (int i : arr2) 
        {
            System.out.print(i+" ");
        }
        System.out.println();

        String arr3[] = obj.method2(arr1);
        for (String i : arr3) 
        {
            System.out.print(i+" ");
        }
        System.out.println();

        

    }

    int[] method1(int[] a)
    {
        return a;
    }

    String[] method2(String[] a)
    {
        return a;
    }



}
