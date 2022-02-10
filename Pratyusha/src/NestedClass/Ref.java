package NestedClass;

public class Ref extends StaticNestedClass.Dog 
{
 public static void main(String[] args)
  {
     Ref robj = new Ref();
     Ref.disp2();
      robj.disp1();
  }
    
}
class Refcls1 extends StaticNestedClass.Dog.Cat.Rat.Bat
{

    
    void disp6() {
    
        
    }

    public static void main(String[] args) {
        Refcls1 robj = new Refcls1();
        robj.disp7();
        robj.disp6();
        
    }
    
}
