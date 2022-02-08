package practice;
public class kss 
{
    int a;
    String b;
// default constructor
// no arg cons
kss(){
    a= 10;
}
kss(int k)
{
    a = k;
    b = "in string";
}
kss(String z,int k){
 a = k;
}
kss(int z,String k){
 a = z;
}

    public static void main(String[] args) 
    {
        int a = 20;
        kss obj = new kss();
        kss obj1 = new kss(30);
     //   kss obj1 = new kss(30,"abcd");
        kss obj2 = new kss(30,"abcd");
        kss obj3 = new kss("hello",100);
        System.out.println(a);
        System.out.println(obj.a);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj2.a);
        System.out.println(obj3.a);
        
    }
}
