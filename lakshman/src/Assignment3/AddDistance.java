package Assignment3;

public class AddDistance 
{
    double distance1;
    double distance2;

    AddDistance(double p,double q)
    {
        distance1 = p;
        distance2 = q;
    }
    public static void main(String[] args) 
    {
        double a = 12.3;
        double b = 18.9;
        AddDistance add = new AddDistance(a, b);
        double totalDistance = add.distance1+add.distance2;
        System.out.println("The sum of given distances is  "+totalDistance);
    }
}
