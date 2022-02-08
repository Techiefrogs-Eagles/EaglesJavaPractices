public class Frog extends Cat {
    
    void barking() {
        System.out.println("barking");
    }
    public static void main(String[] args) {
        Frog c = new Frog();
        c.barking();
        
        c.eat();
    }
}
