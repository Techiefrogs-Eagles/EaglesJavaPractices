package src.Abstract;

public class Abstractdemo1 extends Abstractdemo {

    void display() {
        System.out.println("This is abstract display");
    }
  int sum(int a,int b)
  {
      System.out.println("Sum of a&b="+(a+b));
      return 1;
  }
  
    public static void main(String[] args) {
        Abstractdemo1 abobj=new Abstractdemo1();
        System.out.println(abobj.i);
        System.out.println(abobj.s);
        abobj.display();
        abobj.newdisplay();
        abobj.finaldisplay();
        abobj.sum(3, 4);
        Abstractdemo.staticdisplay();
        
    }
}
