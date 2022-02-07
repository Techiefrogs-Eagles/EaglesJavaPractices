package src;

public class Constructordemo1234 {
    
  int a ;
  String name;
    
    Constructordemo1234()
    {
      System.out.println("This is Constructor");

    }
   Constructordemo1234(int a,String name)
   {
     this.a=a;
     this.name=name;
     System.out.println("This is parem costructor    "+a+" "+ name);

   }
    public static void main(String[] args) {
        Constructordemo1234 Cdobj=new Constructordemo1234();
        Constructordemo1234 Cdobj1=new Constructordemo1234(1,"aaa");

     // System.out.println( Cdobj.name);
      //System.out.println(Cdobj.a);



        
    }
}
