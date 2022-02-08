package practice;
public class op 
{
public static void main(String[] args)
{
    op k = new op();
    k.op1();
 //  op.op1(); 
}
void op1() 
{
 int a = 10;
 int b = 20;
 boolean c = true;
 System.out.println(a<<b);
 System.out.println(a>>b);
 System.out.println(a>>>b); 
 System.out.println(~a);
 System.out.println(!c);
 System.out.println(a + b);
 System.out.println(a - b);
 System.out.println(a * b);
 System.out.println(a / b);
 System.out.println(a % b);
 System.out.println(++a);
 System.out.println(a++);
 System.out.println(--b);
 System.out.println(b--);
 System.out.println(a==b);
 System.out.println(a!=b);
 System.out.println(a>b);
 System.out.println(a<b);
 System.out.println(a>=b);
 System.out.println(a<=b);
}   
}
