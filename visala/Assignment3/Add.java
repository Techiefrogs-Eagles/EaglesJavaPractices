package Assignment3;

public class Add {
 double d1;
 double d2;

Add(double a,double b)
{
d1=a;
d2=b;
}
public static void main(String[] args) {
double p=20.1;
double q=10.1;

    Add adddistance=new Add( p,q);
    double distance=(adddistance.d1+adddistance.d2);

System.out.println("Total distance="+distance);
    }
    
}
