public class StringDemo 
{
    int cat = 20;
    { cat = 50; }
    //string is a class

    String Name = "cat";
    

    
    String str = "Nimmy";

    String  str1 = str.concat(" is a cat");

    public static void main(String[] args) {
        String str2 = "Tomy ";

        String  str3 = str2.concat(" is a cat");
        StringDemo obj = new StringDemo();
        System.out.println(obj.str1);
        System.out.println(str3);

    }





}
