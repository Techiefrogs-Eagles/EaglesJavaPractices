package Practice.TypeCasting;
class Animal{
    public void Method1(){
        System.out.println("in Animal Method1 Barks");
    }
    void Method2(){
        System.out.println("in Animal Method2");
    }
}
class Dog extends Animal{
    void sub(){
        System.out.println("n dog sub method");
    }
    public void Method1(){
        System.out.println("in dog method1");
    }
}
 interface Bird{
     abstract void fly();
 }
 class crow implements Bird{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("in fly method");
    }
     
 }


public class UpCasting extends Dog  {
    public static void main(String[] args) {
        UpCasting up=new UpCasting();
        up.Method1();
        up.Method2();
       
        Animal A=new Animal();
        A.Method1();
        Dog d=new Dog();
        d.sub();
        up.sub();
        
       
     

    }
}
