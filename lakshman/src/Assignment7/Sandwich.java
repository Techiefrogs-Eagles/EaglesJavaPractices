package Assignment7;

public class Sandwich implements FastFood{

    public void chicken(double a) {
        System.out.println(a+"gms of chicken");
    }
    public void vegetables(double a) {
        System.out.println(a+"gms of veggies"); 
    }
    public void bread(int a) {
        System.out.println("add "+a+" pieces of bread");
    }
    public void cheese(int a) {
        System.out.println(a+" slices of cheese");
    }

    public static void main(String[] args) {
        Sandwich obj = new Sandwich();
        obj.bread(2);
        obj.chicken(100);
        obj.vegetables(50);
        obj.cheese(4);
    }
    
}

interface FastFood{
    void chicken(double a);
    void vegetables(double a);
    void bread(int a);
    void cheese(int a);
}