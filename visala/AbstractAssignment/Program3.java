package AbstractAssignment;

public class Program3 {

}
abstract class Marks
{
    abstract void getParcentage();
}


class A extends Marks{

   double s1,s2,s3,AP;
    void getParcentage() {
       AP=((s1+s2+s3)/300)*100;
        System.out.println("A student percentage=" +AP);

    }
    A(double Ms1,double Ms2,double Ms3)
    {
        s1=Ms1;
        s2=Ms2;
        s3=Ms3;
    }
    public static void main(String[] args) {
        A Aobj=new A(70.3,75.4,75.9);
        Aobj.getParcentage();
    }
    }
    


class B extends Marks
{

    double s1,s2,s3,s4,BP;
    void getParcentage() {
       BP=((s1+s2+s3+s4)/400)*100;
        System.out.println("B student percentage=" +BP);

    }
    B(double Ms1,double Ms2,double Ms3,double Ms4)
    {
        s1=Ms1;
        s2=Ms2;
        s3=Ms3;
        s4=Ms4;
    }
    public static void main(String[] args) {
        B Bobj=new B(70.3,75.4,75.9,76.6);
        Bobj.getParcentage();
    }
}