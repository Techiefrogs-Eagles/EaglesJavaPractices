package Assignment9;

public class Program34 {
    public static void main(String[] args) 
    {
        int[] a=new int[]{10,20,30,40,50};
        int  num=0;
        for (int i = 0; i < a.length; i++) 
        {
            num=num+a[i];
        }
        double avg=num/a.length;
        System.out.println("Average = "+avg);
    }
}
