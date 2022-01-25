package practice.AcssesModifiers;

 class defaultMod 
{
    int a1;

    void display()
    {
        int a1 = 50;
        System.out.println("value of a in display = "+a1);
    }

    defaultMod()
    {
        a1 = 40;
        System.out.println("value of a in constructer = "+a1);
    }
    public static void main(String[] args) 
    {
        defaultMod obj1 = new defaultMod();
        obj1.display();
        obj1.a1 = 60;
        System.out.println("value of a in main method after changes = "+obj1.a1);
    }    
}
