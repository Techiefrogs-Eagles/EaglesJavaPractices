package Assignment4;

public class program10 {}

class apple
{
    int number_of_items = 10;
}

class banana extends apple
{
    int number_of_items;

    banana(int a)
    {
        number_of_items = a;
    }

    void show()
    {
        System.out.println("The value of number_of_items(apple) = "+super.number_of_items);
        System.out.println("The value of number_of_items(banana) = "+number_of_items);
    }

    public static void main(String[] args) {
        banana bananaobj = new banana(5);
        bananaobj.show();
    }
}
