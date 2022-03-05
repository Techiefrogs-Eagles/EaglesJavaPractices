package practice.TypeCasting;
class GrandParent{
    void land(){
        System.out.println("land 5 acre");
    }
}
class Parent extends GrandParent{
    void house(){
        System.out.println("house");
    }
    void land(){
        System.out.println("land 4 acre");
    }
} 
class Child1 extends Parent{
    void bike(){
        System.out.println("bike");
    }
    void land(){
        System.out.println("land 2.0 acre");
    }
}
class Child2 extends Parent{
    void doll(){
        System.out.println("doll");
    }
    void land(){
        System.out.println("land 2 acre");
    }
}
class HusbandOfChild2 extends Child2{
    void Factory(){
        System.out.println("factory");
    }
}
public class TypeUpCastingDemo 
{
    public static void main(String[] args) {
        HusbandOfChild2 obj1 = new HusbandOfChild2();
        obj1.Factory();
        obj1.doll();
        obj1.house();
        obj1.land();
        System.out.println();

        Child2 obj2 = obj1;
        obj2.doll();
        obj2.house();
        obj2.land();
        System.out.println();

        Parent obj3 = obj1;
        obj3.house();
        obj3.land();
        System.out.println();

        GrandParent obj4 = obj1;
        obj4.land();
        System.out.println();

        Child1 obj11 = new Child1();
        obj11.bike();
        obj11.house();
        obj11.land();
        System.out.println();

        Parent obj31 = obj11;
        obj31.house();
        obj31.land();
        System.out.println();
        
        GrandParent obj41 = obj11;
        obj41.land();

    }
}