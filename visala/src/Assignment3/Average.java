package src.Assignment3;

public class Average {
    int a;
    int b;
    int c;
    int avg;

    Average()
    {

    }
public static void main(String[] args) {
int a=3,b=6,c=9;

    Average average=new Average();
 average.avg=(a+b+c)/3;
    System.out.println(+average.avg);
}
}
