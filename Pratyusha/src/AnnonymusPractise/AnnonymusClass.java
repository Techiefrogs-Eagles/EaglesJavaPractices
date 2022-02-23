package AnnonymusPractise;

 class AnnonymusClass {}

   class Annonymus1

 {
      static int i = 10;
    


     public static void main(String[] args) {

         Annonymus1 anyobj = new Annonymus1() 
         {
          
            
            public void meth1() 
            {
                System.out.println("This is a Annonimus Method");
                
            }
             
         };
         System.out.println(i);
     }
    }
    
     
 
 class A 
 {
   int a = 10;
   static int b = 20;

   void display()
   {
     System.out.println(b);
   }
    public static void main(String[] args) {
      A obj = new A();
      

      System.out.println(obj.a+"  "+b);
      
    }
 }
