package practice.NestedClass;

public class MethodLocalInnerClasses 
{
    int i = 10;

    void hello1()
    {
        System.out.println("in hello 1");
        class MethodLocalInnerClasses1
        {
            static void hello2()
            {
                System.out.println("in hello 2");
                abstract class MethodLocalInnerClasses2
                {
                    abstract void hello6();
                    void hello3()
                    {
                        System.out.println("in hello 3");
                        final class MethodLocalInnerClasses5
                        {
                            void hello7()
                            {
                                System.out.println("in hello 7");
                            }        
                        }
                        MethodLocalInnerClasses5 obj5 = new MethodLocalInnerClasses5();
                        obj5.hello7();
                    }
                }
                MethodLocalInnerClasses2 obj2 = new MethodLocalInnerClasses2()
                {
                    final void hello6() 
                    {
                        System.out.println("in hello 6"); 
                    }
                };
                obj2.hello3();
                obj2.hello6();
            }
        }
        // MethodLocalInnerClasses1 obj1 = new MethodLocalInnerClasses1();
        MethodLocalInnerClasses1.hello2();
    }

    MethodLocalInnerClasses()
    {
        interface MethodLocalInnerClasses3
        {
            int k = 1000;
            void hello8();
            static void hello4()
            {
                System.out.println("in hello 4");
                class MethodLocalInnerClasses4
                {
                    void hello5()
                    {
                        System.out.println("in hello 5");
                    }
                }
                MethodLocalInnerClasses4 obj4 = new MethodLocalInnerClasses4();
                obj4.hello5();
            }
        }
        MethodLocalInnerClasses3 obj3 = new MethodLocalInnerClasses3()
        {
            public void hello8()
            {
                System.out.println("in hello 8");
                class MethodLocalInnerClasses6
                {
                    void hello9()
                    {
                        System.out.println("in hello 9");
                    }
                }
                MethodLocalInnerClasses6 obj6 = new MethodLocalInnerClasses6();
                obj6.hello9();
            }
        };
        MethodLocalInnerClasses3.hello4();
        obj3.hello8();
        System.out.println(MethodLocalInnerClasses3.k);
    }

    public static void main(String[] args) 
    {
        MethodLocalInnerClasses obj = new MethodLocalInnerClasses();
        obj.hello1();
    }
}