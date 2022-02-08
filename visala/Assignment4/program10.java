package Assignment4;

public class program10 {
    
}
class Apple

{
int number_of_items=10;

}


class Bannana extends Apple{
    int Number_of_items;
    void show(int b)
    {
    
Number_of_items=b;
        System.out.println("Number of items in Bannana="+b);
        System.out.println("Number of items in Apple="+super.number_of_items);
    }
    public static void main(String[] args) {
        Bannana Bobj1=new Bannana();
       
        
        Bobj1.show(20);
       

    }
}
