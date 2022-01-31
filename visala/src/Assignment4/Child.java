package Assignment4;

public class Child extends Parent
{ 


      void display1()
       {
        System.out.println("This is Child Class");

    }
  
public static void main(String[] args) {
    
    Child cobj=new Child();
    Parent pobj=new Parent();
    pobj.display();
    cobj.display1();
    cobj.display();
     
      
}
}