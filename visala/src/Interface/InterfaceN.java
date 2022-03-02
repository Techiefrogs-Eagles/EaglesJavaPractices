package src.Interface;

public class InterfaceN  extends InterfaceN1 implements Interface3{


    public void display() {
        
        System.out.println("this is display");
        
    }

   
    public static void main(String[] args) {
        InterfaceN inobj=new InterfaceN();
        inobj.dispaly3();
        inobj.display();
        inobj.display2();
        //inobj.display3();
        inobj.num(10);
        System.out.println(Interface11.i);
    }


    public void dispaly3() {
        System.out.println("This is display3");
        
        
    }

}
    

