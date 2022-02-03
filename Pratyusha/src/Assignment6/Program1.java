public class Program1 {}

abstract class parent {
    abstract void  message();

}

class subclass1 extends parent{
  void message()
  {
      System.out.println("This is First subclass");
  }
  public static void main(String[] args) {
      
  subclass1 obj1 = new subclass1();
  obj1.message();
  }
}
 class subclass2 extends parent {
    void message()
    {
        System.out.println("This is Second subclass");
    }
    public static void main(String[] args) {
        
    
    subclass2 obj2 = new subclass2();
      obj2.message();    
 }
}
