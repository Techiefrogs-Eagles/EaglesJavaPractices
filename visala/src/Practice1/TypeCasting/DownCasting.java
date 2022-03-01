package src.Practice1.TypeCasting;

class Grandclass{
    void Grand()
    {
        System.out.println("Grand Method");
    }
    void Grand1()
    {
        System.out.println("This is Grand method");
    }

}

class Parentclass extends Grandclass{
    void Parent()
    {
        System.out.println("Parent Method");
    }
    void Grand1()
    {
        System.out.println("This is Parent method");
    }

}
class Childclass1 extends Parentclass{
    void Child1()
    {
        System.out.println("Child1 Method");
        
    }
    void Grand1()
    {
        System.out.println("This is Child1 method");
    }

}
class Childclass2 extends Parentclass{
    void Child2()
    {
        System.out.println("Child2 Method");
    }
    void Grand1()
    {
        System.out.println("This is Child2 method");
    }

}

class Childclass21 extends Childclass2{
    void Child21()
    {
        System.out.println("Child21 Method");
    }
}
public class DownCasting {
    
    public static void main(String[] args) {
       
        Grandclass Gobj=new Childclass21();
        Gobj.Grand();
        Gobj.Grand1();
        ((Parentclass)Gobj).Parent();
        ((Parentclass)Gobj).Grand1();
        System.out.println();
    
       // ((Childclass1)Gobj).Child1();
        //((Childclass1)Gobj).Grand1();
    
        //System.out.println();

        ((Childclass2)Gobj).Child2();
        ((Childclass2)Gobj).Grand1();
        System.out.println();

        ((Childclass21)Gobj).Child21();
        ((Childclass21)Gobj).Grand1();
        ((Childclass21)Gobj).Child2();


           if(Gobj instanceof Childclass2)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
