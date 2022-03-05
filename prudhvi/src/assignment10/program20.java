package assignment10;

public class program20 {
    public static void main(String[] args) {
        String s="hello";
        try
        {
            int a=Integer.parseInt(s);
            System.out.println(a);
        }
        catch(NumberFormatException n)
        {
            s="123";
            int a=Integer.parseInt(s);
            System.out.println(a);
        }
    }
    
}
