package Kssfolder;

public class Downcasting {}
class GrandParent1{
    void land1(){
        System.out.println("land 5 acre");
    }
}
class Parent1 extends GrandParent1{
    void house1(){
        System.out.println("house");
    }
    void land1(){
        System.out.println("land 4 acre");
    }
} 
class Child11 extends Parent1{
    void bike1(){
        System.out.println("bike");
    }
    void land1(){
        System.out.println("land 2.0 acre");
    }
}
class Child21 extends Parent1{
    void doll1(){
        System.out.println("doll");
    }
    void land1(){
        System.out.println("land 2 acre");
    }
}
class HusbandOfChild21 extends Child21{
    void Factory1(){
        System.out.println("factory");
    }
}
   class TypeDownCasting {
    public static void main(String[] args) {
        GrandParent1 a1 = new Child11();
        a1.land1();
        ((Parent1)a1).house1();
        ((Child11)a1).bike1();
        HusbandOfChild21 a2 = new HusbandOfChild21();
       // Child21 a4 = new Child21();
        GrandParent1 a3 =  a2;
        a3.land1();
        ((Parent1)a3).house1();
        ((Child21)a3).doll1();
        ((HusbandOfChild21)a3).Factory1();

        if(a3 instanceof Child21)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
