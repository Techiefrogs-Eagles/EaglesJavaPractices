public class Puppy extends Dog1 {
    void weep() {
        System.out.println("The puppy is weeping");
    }
    public static void main(String[] args) {
        Puppy d = new Puppy();
        d.weep();
        d.Bark();
        d.eat();
    }
}
