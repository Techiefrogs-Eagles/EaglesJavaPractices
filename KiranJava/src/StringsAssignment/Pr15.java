package StringsAssignment;

public class Pr15 {
    public static void main(String[] args) 
    {
        String str = "asdfgh" ;
        String first = str.substring(0,1) ;
        String rem = str.substring(1) ;
        System.out.println(first.toUpperCase()+rem) ;
        String k=str.repeat(3);
        System.out.println(k);
    }
}
