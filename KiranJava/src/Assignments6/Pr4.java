package Assignments6;

public class Pr4 {
    public static void main(String[] args) {
        SubClass sb=new SubClass();
        sb.a_method();
        sb.method();
        
    }
}
abstract class Parent{
    abstract void a_method();
    Parent(){
        System.out.println("this is constructor of abstract class");
    }
    void method(){
        System.out.println("this is normal method of abstract class");
    }
}
class SubClass extends Parent{

    @Override
    void a_method() {
        System.out.println("this is abstract method");
        
    }
   
    
}