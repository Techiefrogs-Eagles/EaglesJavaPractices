package src;

public class EncapsulationDemo1 {
public static void main(String[] args) {
    EncapsulationDemo eobj=new EncapsulationDemo();
    eobj.setI(3615);
    System.out.println(eobj.getI());
    eobj.setS("Mokshitha");
    System.out.println(eobj.getS());
    eobj.setF(123.5f);
    System.out.println(eobj.getF());

    eobj.setB(false);
    System.out.println(eobj.getB());
    


}
    
}
