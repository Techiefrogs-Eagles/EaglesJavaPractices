package practice.Miscellaneous;
public class StringDemo 
{
    int human = 10;
    { human = 5; }
    // string is a class
    String name = "human";
    String hello = name.concat(" is a good boy");
    { name = "human1"; }

    public static void main(String[] args) {
        String name = "human";
    name = name.concat(" is a bad boy");
    //name = "human1";
        StringDemo obj = new StringDemo();
        System.out.println(obj.hello);

        System.out.println(obj.name);
        String name1 = new String("lakshman123");
        System.out.println(name1);
    }
}
