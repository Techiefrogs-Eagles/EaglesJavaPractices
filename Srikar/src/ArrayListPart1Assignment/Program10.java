import java.util.ArrayList;
import java.util.ListIterator;

public class Program10 {
    public static void main(String[] args) 
    {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("S");
        colour.add("R");
        colour.add("I");
        colour.add("K");
        colour.add("A");
        colour.add("R");
        colour.remove(4);

        ListIterator<String> itr = colour.listIterator(colour.size());
        while (itr.hasPrevious()) 
        {
            System.out.println(itr.previous());
        }
    }
}