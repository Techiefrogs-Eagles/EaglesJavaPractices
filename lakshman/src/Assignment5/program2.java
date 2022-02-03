package Assignment5;

public class program2
{
    int num;
    char c;

    void hello(int a , char b)
    { 
        num = a;
        c = b;
        System.out.println("Integer = "+num+"   "+"char = "+c);
    }
    void hello(char a , int b)
    { 
        c = a;
        num = b;
        System.out.println("Integer = "+num+"   "+"char = "+c);
    }

    public static void main(String[] args) {
        program2 ncobj = new program2();
        ncobj.hello(20, 'A');
        ncobj.hello('B', 30);
    }
}
