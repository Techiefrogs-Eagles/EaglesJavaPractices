import java.util.ArrayList;

public class Program16 
{
    public static void main(String[] args) 
    {
        ArrayList<String> name = new ArrayList<String>();
        name.add("S");
        name.add("R");
        name.add("I");
        name.add("K");
        name.add("A");
        name.add("R");

        ArrayList<String> name1 = new ArrayList<String>();
        name1.addAll(name);

        for (String string : name1) 
        {
            System.out.println(string);
        }
    }
} 