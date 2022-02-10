package src.Nestedclass;


public class StaticNestedClass {
    int a=20;
    String name="Java";
    static int b=30;
   
    static class Static1 

    {
        void Ndisplay1()
        {
            System.out.println("This is Ndisplay1");

        }
        static void Sdisplay1()
        {
            System.out.println("This is Sdisplay1");
             
        }
        class Class1
           {
               void Cdispaly1()
               {
                   System.out.println("This is Cdispaly1");

               }
               static class static2
               {
                    void Ndisplay2()
                    {
                        System.out.println("This is Ndisplay2");

                    }
                    static2()
                    {
                        System.out.println("THis is constructor");
                        interface Class2
                        {
                            int c=40;
                            String m="Java1";
                           void Ndispaly3();
                           
                        }
                        Class2 Cobj2=new Class2(){

                        
                            public void Ndispaly3() {
                                {
                                    System.out.println("This is Ndisplay3");
    
                                }
                            }
                            
                        };
                        System.out.println(Class2.c+" " +Class2.m);
                        Cobj2.Ndispaly3();

                    }
                    static abstract class Class3
                    {
                        abstract void Adisplay111();
                        void Ndisplay4()
                        {
                            System.out.println("This is Ndisplay4");

                        }
                        Class3()
                        {
                            System.out.println("This is class3 constrouctor");

                        }
                    }
                    
                }
               
              

            }
    }
    public static void main(String[] args)
    {
        StaticNestedClass Sobj=new StaticNestedClass();
        Static1 S1obj=new Static1();
        Static1.Sdisplay1();
        S1obj.Ndisplay1();
        StaticNestedClass.Static1.Class1  Cobj=S1obj.new Class1();
        Cobj.Cdispaly1();
        System.out.println(Sobj.a+" " +Sobj.name);
        System.out.println(StaticNestedClass.b);
        StaticNestedClass.Static1.Class1.static2 S2obj=new StaticNestedClass.Static1.Class1.static2();
        S2obj.Ndisplay2();
       StaticNestedClass.Static1.Class1.static2.Class3 C3obj=new StaticNestedClass.Static1.Class1.static2.Class3()
       {
        
            
            void Adisplay111() 
            {
               System.out.println("This is abstaract method");

            }
      
            
        };
        C3obj.Ndisplay4();
       
        C3obj.Adisplay111();
    }
    
}
