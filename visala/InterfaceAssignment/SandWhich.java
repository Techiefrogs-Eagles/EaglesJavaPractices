package InterfaceAssignment;

public class SandWhich  implements FastFood{
    
    


public void Bread()
{
System.out.println("Add two bread slices");
}


public void Vegitables() {
    
    System.out.println("Add Tamota and cabagge");
}


public void Cheese() {
    System.out.println("100grams Cheese");
    
}


public void Butter() {
    System.out.println("20grams Butter");
}


public void Chicken() {
    System.out.println("150grams Chicken");
    
}
public static void main(String[] args) {
    SandWhich Sobj=new SandWhich();
    Sobj.Bread();
    Sobj.Butter();
    Sobj.Cheese();
    Sobj.Chicken();
    Sobj.Vegitables();
}
}


interface FastFood
{
    void Bread();
    void Vegitables();
    void Cheese();
    void Butter();
    void Chicken();

}







