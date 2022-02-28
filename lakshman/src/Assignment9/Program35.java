package Assignment9;

public class Program35 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,12,45};
        double sum = 0;
        double meantemp = 0;
        for (int j = 0; j < a.length; j++) 
        {
            meantemp += a[j];
        }
        double mean = meantemp/a.length;
        for (int i = 0; i < a.length; i++) 
        {
            sum += (a[i]-mean)*(a[i]-mean);
        }
        double temp = sum/a.length;
        double SD = Math.pow(temp, 1/2);
        System.out.println("Standard deviation for given array = "+SD);
    }
}
