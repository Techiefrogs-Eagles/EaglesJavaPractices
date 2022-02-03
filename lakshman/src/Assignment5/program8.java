package Assignment5;

public class program8 {}

class A{
    static void parent(){
        System.out.println("parent");
    }
}

class B extends A{
    static void parent(){
        System.out.println("child");
    }
    public static void main(String[] args) {
      /*  A obj = new A();
        B obj1 = new B();
        A obj2 = new B();
        obj.parent();
        obj1.parent();
        obj2.parent();   */ //this is done just to hide the warnings(no errors in this program)
    }
}
