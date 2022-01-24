public class Triangle {

    double s1 =3, s2=4 , s3 = 5;
    double a=0;
    double s ,p;

    Triangle(){

         s = (s1+s2+s3)/2;
        a = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        p=s1+s2+s3;

           
    }
    void display(){
        System.out.println("the area of triangle is" +a);
        System.out.println("the perimeter of triangle is"+p);
    }
    public static void main(String[] args) {
        Triangle area = new Triangle();
        area.display();
    
    }
    
}
