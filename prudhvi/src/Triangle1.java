public class Triangle1 {
    double a ,s,p;
    Triangle1(double s1,double s2,double s3){
        
        s=(s1+s2+s3)/2;
        a=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        p=s1+s2+s3;
    }
    void display(){

        System.out.println("area of trianle is"+a);
        System.out.println("perimeter of triangle is"+p);
    }
    public static void main(String[] args) {
        Triangle1 area = new Triangle1(3,4,5);
        area.display();
    }
    
}
