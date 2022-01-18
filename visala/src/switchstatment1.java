public class switchstatment1 {
    public static void main(String[] args) throws Exception {
        int age= 11;
       int output= switch(age)
{
    case 6:
         System.out.println("kindergarten");
         yield 6;
    case  7:
System.out.println("elementary school");
         yield 7;
    case  11:
    System.out.println("middile school");
         yield 11;
    case 17:
    System.out.println("high school");
          yield 17;
     case 20:
      System.out.println("masters");
         yield 20;
    default:
    System.out.println("invalid");
    yield 0;
};
    }
}
 
