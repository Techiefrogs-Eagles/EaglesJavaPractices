import java.util.ArrayList;
import java.util.Collections;

public class Program17 
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
        Collections.sort(name);


        System.out.println(name.equals(name));

    }
}