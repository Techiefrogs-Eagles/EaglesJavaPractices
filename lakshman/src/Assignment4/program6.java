package Assignment4;

public class program6 {}

class shape
{
    void method(){
        System.out.println("This is a shape");
    }
}

class rectangle1 extends shape
{
    void method1(){
        System.out.println("This is rectangular shape");
    }
}

class cicle extends shape
{
    void method2(){
        System.out.println("This is circlar shape");
    }
}

class square1 extends rectangle1
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
