package Assignment7;

import InterfaceAssignment.InterfaceMethod100;

public class Method2 implements InterfaceMethod100{

    
    public void Method1() {
        System.out.println("This is Method1");
        
    }

    public void Method() {
        System.out.println("This is Method");
    }

    public void Method3() {
        System.out.println("This is Method3");
    }
    public static void main(String[] args) {
Method2 M2obj=new Method2();
M2obj.Method1();
M2obj.Method();
M2obj.Method3(); 
            
        }
    }
