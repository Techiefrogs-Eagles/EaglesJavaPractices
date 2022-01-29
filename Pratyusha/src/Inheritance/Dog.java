package Inheritance;

  class Dog extends Animal{
    public void display() {
        System.out.println("My name is :" + Name);
    }

    public void Bite() {
        System.out.println("SaintBernard can eat Chicken");
    }
}
    class Main{
        public static void main(String[] args) {
            Dog saintBernard = new Dog();
            saintBernard.Name = "Bubbly";
             saintBernard.display();
             saintBernard.Bark();
             saintBernard.Bite();
        }
    }

