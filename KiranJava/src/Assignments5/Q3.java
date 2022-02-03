package Assignments5;

public class Q3 {
     int a,b;
    void area(int a,int b){
        System.out.println("Area of rectangle is "+a*b);
    }
    void area(int a){
        System.out.println("Area of square is "+a*a);
    }
    public static void main(String[] args) {
        Q3 sc=new Q3();
        sc.area(12, 3);
        sc.area(4);
    }
}
