package src.Abstract;

public class Abstractdemo3 extends Abstractdemo1{
    void displayA()
    {
        System.out.println("This is displayA abstract");

    }
  void display1()
  {
      System.out.println("This is child1 display");
  }
  //void finaldisplay()
  //{

  //}
    public static void main(String[] args) {
        Abstractdemo3 ab3=new Abstractdemo3();
        ab3.displayA();
        ab3.display();
        ab3.display1();
        ab3.newdisplay();
        ab3.finaldisplay();
        ab3.sum(5, 10);
        ab3.name("Hello");
        Abstractdemo.staticdisplay();

    }
    
}
