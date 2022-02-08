package practice;

public class lakshmanSC extends subrahmanyamPC 
{
  int money2 = 50000;
  String asset1 = "hello";

  static void hospital(){
    System.out.println("in sc static method");
  }

  lakshmanSC()
  {
  
  }

  void hello(){
    super.newmethod();
    super.hospital();
  }

  void newmethod(){
    System.out.println("lakshman.hello");
    // super.newmethod();
    System.out.println(super.asset1);
  }
    
    public static void main(String[] args) 
    
    {
        lakshmanSC obj = new lakshmanSC();
        obj.coconutFields();
        System.out.println(obj.money2);
        System.out.println(obj.money1);
        System.out.println(obj.money);
        System.out.println(obj.asset1);
        System.out.println(obj.getAsset2());
        obj.newmethod();
        System.out.println(lakshmanSC.f);
        obj.hello();
        lakshmanSC.hospital();
       // lakshmanSC.medicine();
    }
}

