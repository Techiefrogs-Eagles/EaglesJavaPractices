package src;

public class Constructordemo1234 {
    
  int a ;
  String name;
    
    Constructordemo1234()
    {
      this(1,"Java");
      System.out.println("This is Constructor");

    }
   Constructordemo1234(int a,String name)
   {
     this(2,4,5);
     this.a=a;
     this.name=name;
     System.out.println("This is param costructor    "+a+" "+ name);

   }
   Constructordemo1234(int a,int b,int c)
   {
    // this();
     System.out.println(a+b+c);

   }
    public static void main(String[] args) {
        Constructordemo1234 CDobj=new Constructordemo1234();
        //Constructordemo1234 CDobj1=new Constructordemo1234(1,"aaa");

   // System.out.println( CDobj1.name);
     // System.out.println(CDobj1.a);



        
    }
}
