import java.util.ArrayList;

public class Program18 
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

        name.trimToSize();

        System.out.println(name.size());
    }
}