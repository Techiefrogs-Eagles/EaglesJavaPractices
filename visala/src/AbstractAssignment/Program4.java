package src.AbstractAssignment;

public class Program4 {
    
}
abstract class Abstractclass
{
    Abstractclass()
    {
        System.err.println("This is a costrucor of abstract class");
        
    }


    abstract void a_method();
void  method()
{
    System.out.println("This is naormal method in abstract class");

}
}

class Subclass extends Abstractclass{

    
    void a_method() {
        System.out.println("This is abstract method");
        
    }
    public static void main(String[] args) {
        Subclass sobj=new Subclass();
        sobj.method();
        sobj.a_method();
        
    }

}