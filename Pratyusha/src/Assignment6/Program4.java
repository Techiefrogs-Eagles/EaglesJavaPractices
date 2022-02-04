public class Program4 {}

abstract class parentClass {
 abstract void a_method();

   void b_method(){
       System.out.println("This is a normal method of Abstract Class");
   }

   parentClass(){
       System.out.println("This is constructor of Abstract Class");
   }
}


class subclass extends parentClass
{
    void a_method(){
        System.out.println("This is Abstract Method");
    }
    public static void main(String[] args) {
        subclass sobj = new subclass();
        sobj.a_method();
        sobj.b_method();
    }
}
