public class Triangle {
    
        int a,b,c,p;
        Triangle(int x,int y,int z)
        {
            a=x;
            b=y;
            c=z;
            p=a+b+c;
        }
    
    public static void main(String[] args) {
        int area;
        int s;
        Triangle t=new Triangle(12,13,14);
        s=(t.a+t.b+t.c)/2;
        area=(int)Math.sqrt(s*(s-t.a)*(s-t.b)*(s-t.c));
        System.out.println("area of triangle is "+area+" perimeter of the triangle is "+t.p);
    }
}
