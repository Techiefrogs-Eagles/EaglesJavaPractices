package practice.NestedClass;

import practice.NestedClass.StaticNestedClass.static1.Normal1;
import practice.NestedClass.StaticNestedClass.static1.Normal1.static2;
import practice.NestedClass.StaticNestedClass.static1.Normal1.static2.abstract1;

public class StaticNestedClass 
{
    int a = 10;
    String name = "lakshman";
    static int b = 20;

    static class static1
    {
        void n1()
        {
            System.out.println("in static class, method n1");
        }
        static void s1()
        {
            System.out.println("in static class, method s1");
        }

        static class Normal1
        {
            void n2()
            {
                System.out.println("in static class, method n2");
            }
            static void s2()
            {
                System.out.println("in static class, method s2");
            }
            static class static2
            {
                int l = 1000;
                static int jb = 50;
                void n3()
                {
                    System.out.println("in static class, method n3");
                }
                static void s3()
                {
                    System.out.println("in static class, method s3");
                }
                static abstract class abstract1
                {
                    abstract void abn1();
                    void n4()
                    {
                        System.out.println("in static class, method n4");
                    }
                    static void s4()
                    {
                        System.out.println("in static class, method s4");
                    }

                    abstract1(){
                        System.out.println("in abs constructor");
                    }
                }
                static2()
                {
                    System.out.println("in static2 constructor");
                    interface Normal5
                    {
                        void n5();
                        static void s5()
                        {
                            System.out.println("in static class, method s5");
                        }           
                    }
                    Normal5 objin = new Normal5()
                    {

                        public void n5() 
                        {
                            System.out.println("in static class, method n5");
                        }
                    };
                    objin.n5();
                    Normal5.s5();
                }       
            } 
        }
    }

    public static void main(String[] args) 
    {
        StaticNestedClass obj1 = new StaticNestedClass();
        System.out.println(obj1.a+"  "+obj1.name+"  "+StaticNestedClass.b);
        static1 obj2 = new static1();
        static1.s1();
        obj2.n1();
        //StaticNestedClass.static1.Normal1 obj3 = obj2.new Normal1();
        Normal1.s2();
        //obj3.n2();
        StaticNestedClass.static1.Normal1.static2 obj4 = new StaticNestedClass.static1.Normal1.static2();
        obj4.n3();
        static2.s3();
        StaticNestedClass.static1.Normal1.static2.abstract1 obj5 = new StaticNestedClass.static1.Normal1.static2.abstract1() 
        {
            void abn1() 
            {
                System.out.println("in static class, method abn1"); 
            }   
        };
        obj5.abn1();
        obj5.n4();
        abstract1.s4();
    }
}
