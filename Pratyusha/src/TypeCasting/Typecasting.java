package TypeCasting;

public class Typecasting 
{
    public static void main(String[] args) 
    {
     int a = 100; 

     byte b = (byte)a;  //TypeCasting from int to byte   
    
     System.out.println(b);

     //Weidining implicitly 

     byte c = 30;

     int d = c;

     System.out.println(d);

     //Narrowing Explicitly

      long l = 2030;
      int e  = (int)l;

      System.out.println(e);

      //Type Promotion in Expression

      double d1 = 102.30;
      long l1 = 200;

      double l2 = d1+l1;
      System.out.println(l2);









    }
}
