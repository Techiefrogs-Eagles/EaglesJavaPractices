package src.InterfaceAssignment;
public class ClassN implements Interface1
{

   
    public void display() {
        System.out.println("this is display Method");
        /*class ClassNa
        {
            void Display1()
            {
                System.out.println("This is Display1 Method");

            }
        }*/
    }
    public static void main(String[] args) {
        ClassN Cobj=new ClassN();
       Cobj.display();
   // InterfaceAssignment.ClassN.ClassN1 Cobj
    }
   
    
}