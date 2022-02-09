package Interface;

 public class InterfaceN1 implements Interface1,Interface11{

   
    public void display() {
       System.out.println("This is display");
        
    }

   
    public void display2() {
        System.out.println("This is display2");
        
        
    }


    public int num(int a) {
      System.out.println("num  "+a);
        return 0;
    }
    public static void main(String[] args) {
        InterfaceN1 inobj=new InterfaceN1();
         inobj.display();
         inobj.display2();
       System.out.println(Interface11.i);
       inobj.num(10);
            
        }
    }

