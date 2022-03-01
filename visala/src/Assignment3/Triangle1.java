package src.Assignment3;

public class Triangle1 {
    int a,b,c;
    public double getArea(){
      double s = (a+b+c)/2.0;
      return sqrt((s*(s-a)*(s-b)*(s-c)));
    }
    private double sqrt(double d) {
      return 0;
    }
    public double getPerimeter(){
      return (a+b+c)/2.0;
    }
  }
  
  class Ans{
    public static void main(String[] args){
      Triangle1 t = new Triangle1();
      t.a = 3;
      t.b = 4;
      t.c = 5;
      System.out.println(t.getArea());
      System.out.println(t.getPerimeter());
    }
} 