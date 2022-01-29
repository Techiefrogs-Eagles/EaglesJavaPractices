public class MethodDemo {
   int a=15 ;
   int b=5;
   
       public static void main(String[] args) 
       {
        System.out.println("Main Method");
        MethodDemo mobj=new MethodDemo();
//        mobj.display();
        //System.out.println(mobj.sum(3,5));
        MethodDemo.staticmethod();
        System.out.println(MethodDemo.name());

      
       int mul1=mobj.mul();
       System.out.println(mul1);

       int sum=mobj.sum(3,5);
        System.out.println(sum);

       
       String name="hi";
       String name1=mobj.myname(name);
       System.out.println(name);

       System.out.println(mobj.b());
       

       }
       static void staticmethod()
       {
         System.out.println("This is user define static method");

       }
       static String name( )
       {
        char ch='a';
        switch(ch)
        {
            case 'a','e','i','o','u'://->System.out.println(ch+ "  is an vowel");
            return "alphabet";
         
             default://->System.out.println(ch+ " is consonant");
        
         return "Consonent";    
       }
      }
      void display()
      {
        System.out.println("User display method");
      }

      int mul()
      {
       //  int a=3;
        //int b=5;
          System.out.println("Multipulication");
          return a*b;

      }
      int sum(int a ,int b)

        {
            System.out.println("addition");
            return a+b;

        }
         String myname(String name)
        {
            if(name=="visala")
            return "Eagles";
            else{
               // System.out.println("java");
                return name;
            }

        }
        boolean b()
        {
            if(a<b)
             return true;
             else
             return false;
        }
      /*  float value(int c, int d)
        { 
          

            return (c+d)%2;
        }*/
       }

 