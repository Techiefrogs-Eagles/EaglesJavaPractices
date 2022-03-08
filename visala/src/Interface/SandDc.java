package src.Interface;

public class SandDc implements SandD,SandD1 {

    public void display() {
       
        System.out.println("This is normal method");
        
    }
    
    public void default1() {
        System.out.println("This child default");

        SandD.super.default1();
        SandD1.super.default1();
    }
    public static void main(String[] args) {
        SandDc sdobj=new SandDc();
        sdobj.default1();
        sdobj.default2();
        sdobj.display();
        SandD.static1();
        SandD1.static2();
    }

    

    
}
