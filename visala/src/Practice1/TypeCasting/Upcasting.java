package src.Practice1.TypeCasting;

class Mainclass{
    void Main()
    {
        System.out.println("Main Method");
    }
    void Main1()
    {
        System.out.println("This is main method");
    }

}

class Subclass extends Mainclass{
    void Sub()
    {
        System.out.println("Subclass Method");
    }
    void Main1()
    {
        System.out.println("This is Subclass method");
    }

}
class Subclass1 extends Subclass{
    void Sub1()
    {
        System.out.println("Subclass1 Method");
        
    }
    void Main1()
    {
        System.out.println("This is Subclass1 method");
    }

}
class Subclass2 extends Subclass{
    void Sub2()
    {
        System.out.println("Subclass2 Method");
    }
    void Main1()
    {
        System.out.println("This is Subclass2 method");
    }

}

class Subclass21 extends Subclass2{
    void Sub21()
    {
        System.out.println("Subclass21 Method");
    }
}
public class Upcasting {
    
    public static void main(String[] args) {

        Subclass21 S21obj=new Subclass21();
        S21obj.Main();
        S21obj.Sub();
        S21obj.Sub2();
        S21obj.Sub21();
        S21obj.Main1();
       System.out.println();

        Subclass2 S2obj=S21obj;
        S2obj.Main();
        S2obj.Sub();
        S2obj.Sub2();
        S2obj.Main1();
        System.out.println();
    
        
        Subclass Sobj=S21obj;
        Sobj.Main();
        Sobj.Sub();
        Sobj.Main1();
        System.out.println();
        

        Mainclass Mobj=S21obj;
        Mobj.Main();
        Mobj.Main1();
        
        System.out.println();


        Subclass1 S1obj=new Subclass1();
        S1obj.Main();
        S1obj.Sub();
        S1obj.Sub1();
        S1obj.Main1();
        System.out.println();


        Subclass Sobj1=S1obj;
        Sobj1.Main();
        Sobj1.Sub();
        Sobj1.Main1();
        
        System.out.println();
        
        
        Mainclass Mobj1=S1obj;
         Mobj1.Main();
         Mobj.Main1();

        

    
        
        
    }
}