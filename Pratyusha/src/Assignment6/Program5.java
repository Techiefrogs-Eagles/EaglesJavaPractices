package Assignment6;

public class Program5 {}

 abstract class  Animals{
     abstract void cats();
     abstract void dogs();

}
class Cats extends Animals{
    void cats(){
        System.out.println("Cats Meow Meow");
    }
        void dogs(){
            System.out.println("Dogs Bark Bow-Bow");
        }
            public static void main(String[] args) {
                Cats Catsobj = new Cats();
                  Catsobj.cats();
            }
}
class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs Bark Bow-Bow");
    }
    void cats(){
        System.out.println("Cats Meow Meow");
}
public static void main(String[] args) {
    Dogs Dogsobj = new Dogs();
    Dogsobj.dogs();
}
}

