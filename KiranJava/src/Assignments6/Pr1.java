package Assignments6;

public class Pr1 {
    public static void main(String[] args) {
        sub1 s1=new sub1();
        sub2 s2=new sub2();
        s1.message();
        s2.message();
    }
}
abstract class Parent{
    abstract void message();
}
class sub1 extends Parent{

    @Override
    void message() {
        
        System.out.println("this is the first subclass");
    }
    
}
class sub2 extends Parent{

    @Override
    void message() {
       
        System.out.println("this is the second subclass");
    }
    
}