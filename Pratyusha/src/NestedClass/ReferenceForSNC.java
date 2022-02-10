package NestedClass;

public class ReferenceForSNC {
    int a1 = 10;
    String s1 = "Donkey";

    void display11()
    {
        System.out.println("This is display11 Method");
        
       class InnerClass11
        {
              boolean b = false;
               static void display21()
              {
                  System.out.println("This is static1 Method");
                class InnerClass21
                  {
                      double c = 52.23;
                      void display31()
                      {
                          System.out.println("This is display3 Method");
                      }
                  }
                  InnerClass21 Inobj2 = new InnerClass21();
                  Inobj2.display31();
                  System.out.println(Inobj2.c);
                  
                
              }
              InnerClass11()
              {
                  System.out.println("This is a constructor method");
                  interface InnerClass17
                  {
                      void display17();
                      static void display18()
                      {
                          class InnerClass18
                          {
                              void display19()
                              {
                                  System.out.println("This is display19");
                              }
                          }
                          InnerClass18 Inobj8 = new InnerClass18();
                          Inobj8.display19();
                      }
                  }
                  InnerClass17.display18();
                  InnerClass17 Inobj7 = new InnerClass17() {

                
                    public void display17() {
                        System.out.println("This is display10");
                        
                    }
                      
                    
                  };
                  Inobj7.display17();

                  abstract class Abstract1
                  {
                      abstract void Monkey();
                  }
                  Abstract1 abobj = new Abstract1() {
                     void Monkey()
                     {
                         System.out.println("Abstract Method");
                     }
                  };
                  abobj.Monkey();
              }

        }
        InnerClass11.display21();
        InnerClass11 inobj1 = new InnerClass11();
        System.out.println(inobj1.b);



    }
    public static void main(String[] args) {
     ReferenceForSNC methobj1 = new ReferenceForSNC();
        methobj1.display11();
        System.out.println(methobj1.a1);
        System.out.println(methobj1.s1);
    }

}
