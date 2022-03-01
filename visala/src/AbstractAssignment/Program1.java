package src.AbstractAssignment;
public class Program1 {
    
    
}



abstract class Parent
{
    abstract void Massage();
}




class Child extends Parent
{
    void Massage()
    {
      System.out.println("This is first sub class");
    }
public static void main(String[] args) {
    

Child cobj=new Child();
cobj.Massage();
}
}



class Child1 extends Parent
{
    void Massage()
    {
        System.out.println("This is Second sub class");
        
    }
    public static void main(String[] args) {
        
    Child1 ch1obj=new Child1()
    {
        void Massage()
        {
            System.out.println("This is Second sub class");
            
        }
    };
    ch1obj.Massage();

}
}