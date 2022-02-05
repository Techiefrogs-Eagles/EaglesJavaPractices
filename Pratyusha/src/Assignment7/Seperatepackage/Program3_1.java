package Assignment7.Seperatepackage;

import Assignment4.Program4;
import Assignment7.Program3;

class Program3_1 implements Program3 {

    
    public void method1() {
    System.out.println("In method 1");
        
    }

    
    public void method2() {
        System.out.println("In method 2");
        
    }

    
    public void method3() {
      System.out.println("In method 3");
        
    }

    public static void main(String[] args) {
        Program3_1 pobj = new Program3_1();
        pobj.method1();
        pobj.method2();
        pobj.method3();


        

    }
    
}
