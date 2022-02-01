package Assignment4;

class program8 {}

class A
{
    int i;
    int j;

    A(int a,int b)
    {
        i = a;
        j = b;
    }

    void show()
    {
        System.out.println("The value of i = "+i);
        System.out.println("The value of j = "+j);
    }
}

class B extends A
{
    int k;

    B(int c){
        super(100, 200);
        k = c;
    }

    void show()
    {
        System.out.println("The value of k = "+k);
    }

    public static void main(String[] args) {
        B bobj = new B(500);
        bobj.show();
    }
}