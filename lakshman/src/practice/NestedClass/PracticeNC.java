package practice.NestedClass;

public class PracticeNC 
{
    int a = 10;
    void M1()
    {
        System.out.println("in method 1");
    }
    class IC1
    {
        int b = 20;
        void M2()
        {
            System.out.println("in method 2");
        }
        static class SC1
        {
            int c = 30;
            static int d = 40;
            void M3()
            {
                System.out.println("in method 3");
            }
            static void M4()
            {
                System.out.println("in method 4");
            }
        }
    }
    private class IC2
    {
        int e = 50;
        void M5()
        {
            System.out.println("in method 5");
        }
        abstract class A1
        {
            private int h = 80;
            private static int i = 90;
            void M8()
            {
                System.out.println("in method 8");
            }
            static void M9()
            {
                System.out.println("in method 9");
            }
            abstract void M10(); 
        }
    }
    protected class IC3
    {
        int f = 60;
        void M6()
        {
            System.out.println("in method 6");
        }
        interface I1
        {
            int j = 100;
            default void M11()
            {
                System.out.println("in method 11");
            }
            static void M12()
            {
                System.out.println("in method 12");
            }
            void M13(); 
        }
    }
    public class IC4
    {
        int g = 70;
        void M7()
        {
            System.out.println("in method 7");
        }
    }
    public static void main(String[] args) 
    {
        PracticeNC obj1 = new PracticeNC();
        System.out.println(obj1.a);
        obj1.M1();
        PracticeNC.IC1 obj2 = obj1.new IC1();
        System.out.println(obj2.b);
        obj2.M2();
        PracticeNC.IC1.SC1 obj3 = new PracticeNC.IC1.SC1();
        System.out.println(obj3.c+"  "+PracticeNC.IC1.SC1.d);
        obj3.M3();
        PracticeNC.IC1.SC1.M4();
        PracticeNC.IC2 obj4 = obj1.new IC2();
        System.out.println(obj4.e);
        obj4.M5();
        PracticeNC.IC3 obj5 = obj1.new IC3();
        System.out.println(obj5.f);
        obj5.M6();
        PracticeNC.IC4 obj6 = obj1.new IC4();
        System.out.println(obj6.g);
        obj6.M7();
        PracticeNC.IC2.A1 obj7 = obj4.new A1()
        {
            void M10() 
            {
                System.out.println("in method 10");
            }
        };
        System.out.println(obj7.h);
        System.out.println(PracticeNC.IC2.A1.i);
        obj7.M8();
        PracticeNC.IC2.A1.M9();
        obj7.M10();
        PracticeNC.IC3.I1 obj8 = new PracticeNC.IC3.I1()
        {
            public void M13() 
            {
                System.out.println("in method 13");
            }
        };
        System.out.println(PracticeNC.IC3.I1.j);
        obj8.M11();
        PracticeNC.IC3.I1.M12();
        obj8.M13();
    }
}