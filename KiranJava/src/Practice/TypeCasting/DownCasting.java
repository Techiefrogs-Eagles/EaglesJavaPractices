package Practice.TypeCasting;
class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    void Run(){
        System.out.println("Animal Run method");
    }
}
interface Body{
    void sub();
}
class Cat extends Animal implements Body{
    void mew(){
        System.out.println("cat mews");
    }
    void eat(){
        System.out.println("cat eats");
    }

    @Override
    public void sub() {
        // TODO Auto-generated method stub
        System.out.println("interface method");
    }
}
public class DownCasting {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.mew();
        Animal an=new Cat();
        if(an instanceof Cat){
        ((Cat) an).mew();
        
        ((Body) an).sub();
        }
       
    }
}
