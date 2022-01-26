package practice.AcssesModifiers;

public class privateMod 
{
    private int a;

    private void display()
    {
        int a = 20;
        System.out.println("value of a in display = "+a);
    }

    private privateMod()
    {
        a = 10;
        System.out.println("value of a in constructer = "+a);
    }
    public static void main(String[] args) 
    {
        privateMod obj = new privateMod();
        obj.display();
        obj.a = 30;
        System.out.println("value of a in main method after changes = "+obj.a);
        defaultMod obj1 = new defaultMod();
        obj1.a1 = 50;
        System.out.println(obj1.a1);
    }
}

class class2
{

}
