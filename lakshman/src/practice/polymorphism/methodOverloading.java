package practice.polymorphism;

public class methodOverloading {
    void bhaskar(){ System.out.println("1"); }
    void bhaskar(int a){ System.out.println("2"); }
    void bhaskar(int a,String b){ System.out.println("3"); }
    void bhaskar(String b, int a){ System.out.println("4"); }
    void bhaskar(int a ,double b,int c){ System.out.println("5"); }
    void bhaskar(boolean a,int b,String c){ System.out.println("6"); }
    static void bhaskar(int a,boolean b){ System.out.println("7"); }
    // String bhaskar(int a){ System.out.println("8"); return "hello"; }
    

    public static void main(String[] args) 
    {
        methodOverloading moobj = new methodOverloading();
        moobj.bhaskar();
        moobj.bhaskar(10);
        moobj.bhaskar(10, "hello");
        moobj.bhaskar("hello", 'A');
        moobj.bhaskar(10, 10, 10);
        moobj.bhaskar(true, 10, "hello");
        methodOverloading.bhaskar(10, true);

        System.out.println((int)'A');
    }
}
