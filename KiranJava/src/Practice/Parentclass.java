package Practice;

public class Parentclass {
    private void pmethod()
    {
        System.out.println("this is parent class");
    }
}
class Child extends Parentclass{
    public void cmethod()
    {
        System.out.println("this is child class");
    }
}
class pract
{
    public static void main(String[] args) {
        Parentclass p=new Parentclass();
        Child c=new Child();
        //p.pmethod();
        c.cmethod();
        c.pmethod();
    }
}
