package Assignment4;

class program7 {}

class counter
{
    int i;

    void increment(int a)
    {
        i = a;
        System.out.println("i = "+i);
    }
}

class counter1 extends counter
{
    public static void main(String[] args) {
        counter1 objCounter1 = new counter1();
        objCounter1.increment(3);
    }
}