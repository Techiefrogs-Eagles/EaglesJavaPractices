package inheritance;

public class Chaild1 extends Parent {
      int i=15;
    void alldisplay()
    {
        System.out.println("This is child alldisplay");

    }
    Chaild1()
    {

        System.out.println("This is child constroctor");
        System.out.println(i+ " "+super.i);

    }
    Chaild1(int a)
    {
        super("hi");
        System.out.println("This is child perm");
    }
    public static void main(String[] args) {
        Chaild1 cobj1=new Chaild1(70);
        
        cobj1.display();
        cobj1.display1();
        cobj1.alldisplay();
        System.out.println(Grandparent.sum(2,3));
      
        
       System.out.println( cobj1.mul());

        
    }
    
}
