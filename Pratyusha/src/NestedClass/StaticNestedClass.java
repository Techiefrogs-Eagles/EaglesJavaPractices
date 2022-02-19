package NestedClass;

public class StaticNestedClass 
{
    int i = 10;
    String name = "Jimmy";
    static int a = 50;

    static class Dog
    {
        void disp1()
        {
            System.out.println("This is Display method1");
        }
        static void disp2()
        {
            System.out.println("This is a static  Display method2");
        }
        class Cat 
        {
            void disp3()
            {
                System.out.println("This is Display method3");
            }
               static class Rat
                {
                    void disp4()
                    {
                        System.out.println("This is a method in static class Display method4");
                    }
                        Rat()
                        {
                            System.out.println("This is a Constructor");
                            class Frog
                            {
                             double d = 24.32;
                             byte b = 25;
                              
                             void disp5()
                             {
                                 System.out.println("This a Method in constructor");
                             }

                            }
                            Frog fobj = new Frog();
                            System.out.println(fobj.d+"  "+fobj.b);
                            fobj.disp5();
                        }
                         static abstract class Bat
                        {
                            String s = "Abstract";
                            abstract void disp6();

                            void disp7()
                            {
                                System.out.println("This is a Abstract Method in Constructor 123");
                            }
                            

                            
                        }
                }
        }
    }
           public static void main(String[] args) 
             {
               StaticNestedClass sobj = new StaticNestedClass();
                Dog objDog = new Dog();
                objDog.disp1();
                StaticNestedClass.Dog.Cat stacobj = objDog.new Cat();
                stacobj.disp3();
                StaticNestedClass.Dog.Cat.Rat stacobj1 = new StaticNestedClass.Dog.Cat.Rat();
                stacobj1.disp4();
                System.out.println(sobj.i+" "+sobj.name);
                System.out.println(StaticNestedClass.a);
                StaticNestedClass.Dog.Cat.Rat.Bat bobj =new  StaticNestedClass.Dog.Cat.Rat.Bat() {
                
                    
                    void disp6() {
                        System.out.println("This is a Abstract Class New");
                        
                    }
                
                    
                };
                bobj.disp7();
                bobj.disp6();
                

                
             }

}
