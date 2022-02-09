package Interface;

public class InterfaceNor3 extends InterfaceNor2 implements Interface4{ 
public void display4() {
    System.out.println("In interface4 display4");
      
  }

  
  public String display44() {
  System.out.println("In interface4 display44");
      return "in display44";
  }


    public static void main(String[] args) {
        InterfaceNor3 intobj = new InterfaceNor3();
        intobj.display4();
        intobj.display44();
        intobj.display1();
        intobj.display11();
        intobj.display2();
        intobj.display22();
        intobj.display3();
        intobj.display33();
        intobj.display5();
        intobj.displayN11();
        intobj.displayN12();
        System.out.println("i = "+interface1.i);
        System.out.println("i = "+Interface2.i);
        System.out.println("a = "+Interface3.a);
        System.out.println("b = "+Interface4.b);
        System.out.println("a = "+Interface5.a);
        System.out.println("name = "+interface1.name);
        System.out.println("name = "+Interface2.name);
        System.out.println("name = "+Interface3.name);
        System.out.println("name = "+Interface4.name);
        System.out.println("name = "+Interface5.name);




    }

    }

