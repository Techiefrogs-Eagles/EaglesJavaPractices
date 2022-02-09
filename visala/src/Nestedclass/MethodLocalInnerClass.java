package src.Nestedclass;

public class MethodLocalInnerClass {
    private int i=10;
    String n="Java";
    void display()
    {
        System.out.println("This is display Method");
        class Innerclass
        {
            int j=20;
            static void display11()
            {
                System.out.println("This is static method");
                class Innerclass1
                {
                    
                int k=10;
                   void display22()
                   {
                       System.out.println("This is dispaly2");

                   }
                   Innerclass1()
                   {
                       System.out.println("This is Innerclass1 Constructor");
                           
                       abstract class Abstract1
                       {
                         abstract  void Display();
                         void Display55()
                          {
                            System.out.println("Abstract Method");
                             class Innerclass6
                             {
                                 void display44()
                                 {
                                     System.out.println("This is display44");
                                 }
                             }
                            Innerclass6 Inobj6=new Innerclass6();
                            Inobj6.display44();
                         }
                       }
                       Abstract1 Abobj=new Abstract1() 
                       {
                         void Display()
                         {
                            System.out.println("This is Abstract method");
                            
                         }
                                                                    
                       };
                                                                                         
                       Abobj.Display();
                       Abobj.Display55();
                   }
                  
                }
                Innerclass1 Inobj1=new Innerclass1();
               
                Inobj1.display22();
                System.out.println(Inobj1.k);
               
            }
            
            
        }
        
        Innerclass Inobj=new Innerclass();
        System.out.println(Inobj.j);
        Innerclass.display11();
    }
    MethodLocalInnerClass()
    {
        System.out.println("This is constructor in outer class");
        class Con1
        {
          private  void display33()
            {
                System.out.println("This is Constructor in innerclass");
                interface Innerclass7
                {
                    void display66();
                    static void display77()
                    {
                        class Innerclass8
                        {
                            void display88()
                            {
                                System.out.println("This is method display88");

                            }
                        }
                        Innerclass8 Inobj8=new Innerclass8();
                        Inobj8.display88();
                    }
                }
                Innerclass7.display77();
                Innerclass7 Inobj7=new Innerclass7() 
                {

                  
                    public void display66() 
                    {
                       System.out.println("This is display66");
                       class Innerclass9
                       {
                           void display99()
                           {
                               System.out.println("This is display method 99");

                           }
                       }
                       Innerclass9 Inobj9=new Innerclass9();
                      Inobj9.display99();
                        
                    }
                    
                };
                Inobj7.display66();
            }
        }
        Con1 Cobj=new Con1();
        Cobj.display33();
    }      
     public static void main(String[] args) 
    
    {
        MethodLocalInnerClass Mobj=new MethodLocalInnerClass();
        Mobj.display();
        System.out.println(Mobj.i);
        System.out.println(Mobj.n);
        

    }

}
