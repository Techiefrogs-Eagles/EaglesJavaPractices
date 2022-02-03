package Abstract;

public class Abstractdemo1 extends Abstractdemo {

    
    void display() {
        System.out.println("This is abstract display");
    }
  
    public static void main(String[] args) {
        Abstractdemo1 abobj=new Abstractdemo1();
        System.out.println(abobj.i);
        System.out.println(abobj.s);
        abobj.display();
        abobj.newdisplay();
        abobj.finaldisplay();
        Abstractdemo.staticdisplay();
        
    }
}
