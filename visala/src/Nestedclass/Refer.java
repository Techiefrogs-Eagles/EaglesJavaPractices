package src.Nestedclass;

public class Refer extends StaticNestedClass.Static1
{
    public static void main(String[] args)
     {
        Refer Robj=new Refer();
        Robj.Ndisplay1();
        StaticNestedClass.Static1.Sdisplay1();
    }
   
    

}
class Refer1 extends StaticNestedClass.Static1.Class1.static2.Class3
{

   
    void Adisplay111() 
    {
        System.out.println("This is Adisplay method");

    }
    public static void main(String[] args) {
        Refer1 Robj=new Refer1();
        Robj.Adisplay111();
       //Robj.Ndisplay2();
        Robj.Ndisplay4();
    }
 
    
}