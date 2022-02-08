package practice.polymorphism;

public class methodOverriding 
{
    void sairam(){ System.out.println("in method 1"); }
    void venkat(){ System.out.println("in method 1"); }
    static void varma(){ System.out.println("in method 1"); }
}

class samplemethodoverriding extends methodOverriding
{
    void sairam(){ System.out.println("in method 2"); }
    void venkat(){ System.out.println("in method 2"); }
    static void varma(){ System.out.println("in method 2"); }

    public static void main(String[] args) 
    {
        samplemethodoverriding smorobj = new samplemethodoverriding();
        smorobj.sairam();
        smorobj.venkat();
        samplemethodoverriding.varma();
    }
}