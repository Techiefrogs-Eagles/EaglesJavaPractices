package Assignment3;

public class Triangle {
    
   
 int p;
double A;
 int a;
 int b;
 int c;


    Triangle()
    {
      //  System.out.println("Print the area and peramiter");
        
    }
    public static void main(String[] args) {
      double a=3;
     double b=4;
      double c=5;
     double p;
     double A;
        Triangle perameter=new Triangle();
        perameter.p=(int) (a+b+c);
        
        System.out.println("print parameter");
        System.out.println(perameter.p+"");
        Triangle area=new Triangle();
        System.out.println("area");
            p=(a+b+c)/2;
          //  System.out.println(p+"");
        area.A= sqrt( p*(p-a)*(p-b)*(p-c) );
        System.out.println(area.A+" ");

    }
    private static double sqrt(double d) {
        return 0;
    }
   
    
    }

