package Assignment4;

public class Program6 {}
class Shape {
    void monkey() {
        System.out.println("This is a shape");
    }
}
class rectangle1 extends Shape {

    void monkey1() {
        System.out.println("This is rectangular shape");
    }
}

class circle extends Shape {
    void monkey2() {
        System.out.println("This is circular shape");
    }
}
class square1 extends rectangle1 {
    void monkey3() {
        System.out.println("Square is a rectangle");
    }

public static void main(String[] args) {
    square1 bobj = new square1();
    bobj.monkey();
    bobj.monkey1();

}
}