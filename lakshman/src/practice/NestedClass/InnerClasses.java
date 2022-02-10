package practice.NestedClass;

import practice.NestedClass.InnerClasses.InnerClasses1.InnerClasses2;

public class InnerClasses 
{
    int a = 10;
    String name = "lakshman";
    
    void normalMethod1()
    {
        System.out.println("in normal method 1");
    }

    static void staticmethod1()
    {
        System.out.println("in static method 1");
    }

    InnerClasses()
    {
        System.out.println("in constructor InnerClasses");
    }

    class InnerClasses1
    {
        int a = 20;
        boolean l = true;

        private void normalMethod2()
        {
            System.out.println("in normal method 2");
        }
    
        static void staticmethod2()
        {
            System.out.println("in static method 2");
        }
    
        InnerClasses1()
        {
            System.out.println("in constructor InnerClasses1");
        }

        class InnerClasses2
        {
            int a = 20;
            float f = 30.0f;
    
            protected void normalMethod3()
            {
                System.out.println("in normal method 3");
            }
        
            static void staticmethod3()
            {
                System.out.println("in static method 3");
            }
        
            InnerClasses2()
            {
                System.out.println("in constructor InnerClasses2");
            }
        }
    }

        class InnerClasses4
        {
            void normalMethod4()
            {
                System.out.println("in normal method 4");
            }
        
            InnerClasses4()
            {
                System.out.println("in constructor InnerClasses");
            }

            abstract class InnerClasses5
            {
                abstract void normalMethod5();
            }

            class InnerClasses6 extends InnerClasses5
            {
                void normalMethod5()
                {
                    System.out.println("in abstract method");
                }

            }
        }
    

    public static void main(String[] args) {
        InnerClasses obj1 = new InnerClasses();
        InnerClasses1 obj2 = obj1.new InnerClasses1();
        InnerClasses.InnerClasses1.InnerClasses2 obj3 = obj2.new InnerClasses2();
        InnerClasses4 obj4 = obj1.new InnerClasses4();
        InnerClasses.InnerClasses4.InnerClasses6 obj6 = obj4.new InnerClasses6();
        obj6.normalMethod5();
        obj1.normalMethod1();
        InnerClasses.staticmethod1();
        obj2.normalMethod2();
        InnerClasses1.staticmethod2();
        obj3.normalMethod3();
        InnerClasses2.staticmethod3();

    }
}
