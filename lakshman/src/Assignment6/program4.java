package Assignment6;

public class program4 {}

abstract class parentClass{
    abstract void a_method();

    void b_method(){
        System.out.println("This is normal method of abstract class");
    }

    parentClass(){
        System.out.println("This is constructor of abstract class");
    }
}

class subclass extends parentClass
{
    void a_method(){
        System.out.println("This is abstract method");
    }

    public static void main(String[] args) {
        subclass sobj = new subclass();
        sobj.a_method();
        sobj.b_method();
    }
}
