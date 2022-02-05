package src;

public class Accessmodifier1 {
    int i=40;
   
    void display()
    {
        System.out.println("This is test method");

    }
     // Accessmodifier1()
   // {
        
    //}
    public static void main(String[] args) {
       Accessmodifier ac=new Accessmodifier();
        System.out.println(+ac.i);
ac.display();
  
}
}
