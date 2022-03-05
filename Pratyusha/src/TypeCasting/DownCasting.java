package TypeCasting;

 class GrandParent1
 {
    void Grand()
    {
        System.out.println("This is granparent Method");
    }
}
 class Parent1 extends GrandParent1
 {
     void Parent()
     {
         System.out.println("This is parent Method");
     }
 }
 class Child3 extends Parent1
 {
     void Chi3()
     {
         System.out.println("This is child3 Method");
     }
 }
 class Child4 extends Parent1
 {
     void chi4()
     {
         System.out.println("This is child4 Method");
     }
 }
 class NewChild extends Child4
 {
     void Newchi()
     {
         System.out.println("This is Newchild Method");
     }
 }

public class DownCasting 
{
    public static void main(String[] args) 
    {
        GrandParent1 Gobj=new NewChild();
        Gobj.Grand();
        ((Parent1)Gobj).Parent();
        ((Child4)Gobj).chi4();
        ((NewChild)Gobj).Newchi();
        Child3 cobj = new Child3();
        cobj.Chi3();
        if(Gobj instanceof Child3)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}
