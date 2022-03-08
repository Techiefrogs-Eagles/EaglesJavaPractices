package src.AbstractAssignment;

public class Program5 {
    
}
abstract class Animal
{
    abstract void cats();
    abstract void dogs();
}


class Cats extends Animal{
    void cats()
    {
        System.out.println("Cats Meow");
    }

    
    void dogs() {
        System.out.println("Dogs bark");;
        
    }
    public static void main(String[] args) {
        Cats cobj=new Cats();
        cobj.cats();
        cobj.dogs();
    }
}
class Dogs extends Animal
{
    void cats()
    {
        System.out.println("Cats Meow");
    }

    
    void dogs() {
        System.out.println("Dogs bark");;
        
    }
    public static void main(String[] args) {
        Dogs dobj=new Dogs();
        dobj.cats();
        dobj.dogs();
    }
}