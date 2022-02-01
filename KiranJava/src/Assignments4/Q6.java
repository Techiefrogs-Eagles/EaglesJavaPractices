package Assignments4;

public class Q6 {
    
}
class Shape
{
    void method(){
        System.out.println("This is a Shape");
    }
}

class Rectang extends Shape
{
    void method1(){
        System.out.println("This is rectangular Shape");
    }
}

class circle extends Shape
{
    void method2(){
        System.out.println("This is circlar Shape");
    }
}
class square1 extends Rectang
{
    void method3()
    {
        System.out.println("Square is a Rectangle");
    }

    public static void main(String[] args) {
        square1 squobj = new square1();
        squobj.method();
        squobj.method1();
    }
}