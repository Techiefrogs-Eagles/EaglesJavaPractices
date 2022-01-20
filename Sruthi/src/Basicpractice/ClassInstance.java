package Basicpractice;
//  Class & Object
public class ClassInstance {
    int a = 200;
    static int b = 10;
    String S = "It's my Class instance program";
    static String S1 = "It";

    void calculator() // method 
    {
        int a,b,c;
        a = 10; b = 20;
        c = a + b;
        System.out.println("C value is " +c);
    }

    public static void main(String[] args) {
              
        ClassInstance Obj = new ClassInstance();
        Obj.a = 300;
        Obj.S = "Hope";
    
        ClassInstance Obj1 = new ClassInstance();
        Obj1.a = 250;
        Obj1.calculator(); // method calling
        Obj1.S1 = "Hi";
        Obj1.S1 = "Hello";
                
        System.out.println(Obj.S+ " " +Obj.a);
        System.out.println(Obj1.S1+ " " +Obj1.a);

       System.out.println(ClassInstance.S1+ " " +Obj.b);

    }
    
}
