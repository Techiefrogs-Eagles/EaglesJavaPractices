package practice;

public class practiceAC {
    static int a= 10;
    static void hello(){
        System.out.println("in static method");
    }

    void hey()
    {
        System.out.println(a);
    }

    //abstract void method1();
    public static void main(String[] args) 
    {
        practiceAC obj = new practiceAC()
        {
            int a = 30;

            public void method1() 
            {
                System.out.println("in method 1"+a);
            }
        };
        System.out.println(a);
        practiceAC.hello();
    }
}
