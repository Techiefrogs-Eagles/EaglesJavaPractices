package src.Interface;

public interface Interface11 {
    int i=30;
    String s="hello";
   void display();
static private void display6()
{
    System.out.println("This is private Static method");
    
}
private void display8()
{
    System.out.println("This is Private method");
}


 public static void main(String[] args) {
     Interface11 Ionj=new Interface11() {
    
        public void display() {
            System.out.println("This is display method");

                    }
            };
        Interface11.display6();
        Ionj.display();
        Ionj.display8();       
    
 }
       
   }
   
 
    
