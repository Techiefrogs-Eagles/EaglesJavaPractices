package Assignment9Arrays;

public class Program35 
{
    public static void main(String[] args) 
    {
    int a[] = {1,2,3,4,5};
    double x = 0;
    double Meanval = 0;
    for(int i = 0;i<a.length;i++)
    {
          Meanval += a[i];
    }
       double Mean = Meanval/a.length;
       for(int j = 0;j<a.length;j++)
       {
           x = x+Math.pow((a[j]-Mean),2);
       }
       double SD = Math.sqrt(x/a.length);
       System.out.println("Standard deviation for given arrays is:" + SD);
    }
}
