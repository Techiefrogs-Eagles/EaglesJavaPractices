package Assignment6;

public class program5 {}

abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }

    void dogs(){
        System.out.println("Dogs bark");
    }

    public static void main(String[] args) {
        Cats Catsobj = new Cats();
        Catsobj.cats();
    }
}

class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs bark");
    }

    void cats(){
        System.out.println("Cats meow");
    }

    public static void main(String[] args) {
        Dogs Dogsobj = new Dogs();
        Dogsobj.dogs();
    }
}
