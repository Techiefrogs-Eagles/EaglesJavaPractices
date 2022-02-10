package src.Nestedclass;

public class StaticNestedClass1  
{ 
     private int i=10;
    String n="Java";
    void Rdisplay()
    {
        System.out.println("This is Rdisplay Method");
        class RInnerclass 
        {
            int j=20;
            static void Rdisplay11()
            {
                System.out.println("This is static method");
                class RInnerclass1
                {
                    
                int k=10;
                   void Rdisplay22()
                   {
                       System.out.println("This is Rdispaly2");

                   }
                   RInnerclass1()
                   {
                       System.out.println("This is RInnerclass1 Constructor");
                           
                       abstract class RAbstract1
                       {
                         abstract  void RDisplay();
                         void RDisplay55()
                          {
                            System.out.println("RAbstract Method");
                             class RInnerclass6
                             {
                                 void Rdisplay44()
                                 {
                                     System.out.println("This is Rdisplay44");
                                 }
                             }
                            RInnerclass6 RInobj6=new RInnerclass6();
                            RInobj6.Rdisplay44();
                         }
                       }
                       RAbstract1 RAbobj=new RAbstract1() 
                       {
                         void RDisplay()
                         {
                            System.out.println("This is Abstract method");
                            
                         }
                                                                    
                       };
                                                                                         
                       RAbobj.RDisplay();
                       RAbobj.RDisplay55();
                   }
                  
                }
                RInnerclass1 RInobj1=new RInnerclass1();
               
                RInobj1.Rdisplay22();
                System.out.println(RInobj1.k);
               
            }
            
            
        }
        
        RInnerclass RInobj=new RInnerclass();
        System.out.println(RInobj.j);
        RInnerclass.Rdisplay11();
    }
    StaticNestedClass1()
    {
        System.out.println("This is constructor in outer class");
        class RCon1
        {
          private  void Rdisplay33()
            {
                System.out.println("This is Constructor in Rinnerclass");
                interface RInnerclass7
                {
                    void Rdisplay66();
                    static void Rdisplay77()
                    {
                        class RInnerclass8
                        {
                            void Rdisplay88()
                            {
                                System.out.println("This is method Rdisplay88");

                            }
                        }
                        RInnerclass8 RInobj8=new RInnerclass8();
                        RInobj8.Rdisplay88();
                    }
                }
               RInnerclass7.Rdisplay77();
                RInnerclass7 RInobj7=new RInnerclass7() 
                {

                  
                    public void Rdisplay66() 
                    {
                       System.out.println("This is Rdisplay66");
                       class RInnerclass9
                       {
                           void Rdisplay99()
                           {
                               System.out.println("This is Rdisplay method 99");

                           }
                       }
                       RInnerclass9 RInobj9=new RInnerclass9();
                      RInobj9.Rdisplay99();
                        
                    }
                    
                };
                RInobj7.Rdisplay66();
            }
        }
        RCon1 RCobj=new RCon1();
        RCobj.Rdisplay33();
    }      
     public static void main(String[] args) 
    
    {
        StaticNestedClass1 RSobj=new StaticNestedClass1();
        RSobj.Rdisplay();
        System.out.println(RSobj.i);
        System.out.println(RSobj.n);
        
    }

    

}
