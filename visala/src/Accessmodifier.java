package src;

public class Accessmodifier {
  int i=36;
    void display()
    {
        System.out.println("This is display method");
    
    
        }
       Accessmodifier(){
    }                                                                                                                                                     
    public static void main(String[] args) {
  Accessmodifier ac=new Accessmodifier();
        System.out.println(+ac.i);
     ac.display();
    }
    
}
