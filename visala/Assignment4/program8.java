package Assignment4;

public class program8 {
    
}
class A
{
    int i;
    int j;
A(int a,int b)
{
i=a;
j=b;
}
void show()
{
System.out.println("Value of i="   +i);
System.out.println("Value of j="   +j);
}
}

class B extends A{
    int k;
    B(int c)
    {
        super(36, 15);
         k=c;
    }
    void show()
    {
    System.out.println("Value of k="   +k);
}
public static void main(String[] args) {
    B Bobj=new B(3615);
Bobj.show();
}
}