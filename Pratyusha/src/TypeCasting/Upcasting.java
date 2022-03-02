package TypeCasting;
class GrandGrandparent
{
    void BlueWhale()
    {
        System.out.println("I am Blue Whale");
    }
}

class Grandparent extends GrandGrandparent
{
  void Rabbit()
  {
      System.out.println("I am Rabbit");
  }
}

class Parent extends Grandparent
{
   void Tortise()
   {
       System.out.println("I am Tortise");
   }
}
class child1 extends Parent
{
  void FighterFish()
{
    System.out.println("I am FighterFish");
}
}
class child2 extends Parent
{
   void GoldenFish()
   {
       System.out.println("I am GoldenFish");
   }
}

class MotherofParent extends Parent
{
    void Shark()
    {
        System.out.println("I am Shark");
    }
}

public class Upcasting 
{
    public static void main(String[] args) 
    {
        child2 objc = new child2();
        objc.Rabbit();
        objc.Tortise();
        objc.GoldenFish();
        objc.BlueWhale();
        

        Parent objc2 = objc;
        objc2.Rabbit();
        objc2.Tortise();
        objc2.BlueWhale();

        child1 objc3 = new child1();
        objc3.FighterFish();
        objc3.BlueWhale();

        Grandparent objc4 = objc;
        objc4.Rabbit();
        objc4.BlueWhale();

        GrandGrandparent objc5 = objc3;
        objc5.BlueWhale();

        MotherofParent objc6 = new MotherofParent();
        objc6.BlueWhale();
        objc6.Rabbit();
        objc6.Shark();
        objc6.Tortise();



    }

}

    

