package seperatepackage;

//import Assignment7.program3;

public class program3_1 implements Assignment7.program3{

    public void method1() {
        System.out.println("in method 1");  
    }

    public void method2() {
        System.out.println("in method 2");
    }

    public void method3() {
        System.out.println("in method 3");
    }
    
    public static void main(String[] args) {
        program3_1 pobj = new program3_1();
        pobj.method1();
        pobj.method2();
        pobj.method3();
    }
}
