package Assignments5;

public class Q8 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        A obj=new B();
        A.method();
        B.method();
        obj.method();
    }
}
class A{
    static void method(){
        System.out.println("parent");
    }
}
class B extends A{
    static void method(){
        System.out.println("child");
    }
}
