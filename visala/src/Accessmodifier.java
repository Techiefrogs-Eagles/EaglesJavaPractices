public class Accessmodifier {
  int i=36;
    void display()
    {
        System.out.println("This is display method");
    
    
        }
       private Accessmodifier(){
    }                                                                                                                                                     
    public static void main(String[] args) {
  Accessmodifier ac=new Accessmodifier();
        System.out.println(+ac.i);
     ac.display();
    }
    
}
