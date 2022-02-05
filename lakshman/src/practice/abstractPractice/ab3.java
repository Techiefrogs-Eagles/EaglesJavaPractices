package practice.abstractPractice;

abstract public class ab3 extends ab2
{
    int k = 300;

    @Override
    void display1() {
        System.out.println("in ab3 display1");
        
    }

    @Override
    void display2() {
        System.out.println("in ab3 display2");
        
    }

    abstract void display3();

    abstract void display4();
    
}
