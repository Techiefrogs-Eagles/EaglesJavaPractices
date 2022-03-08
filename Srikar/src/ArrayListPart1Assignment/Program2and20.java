
import java.util.ArrayList;
import java.util.Iterator;

public class Program2and20 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("S");
        name.add("R");
        name.add("I");
        name.add("K");
        name.add("A");
        name.add("R");

        Iterator<String> itr = name.iterator();
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
        ArrayList<String> name1 = (ArrayList)name.clone();

        for (String string : name) {
            System.out.println(string);
        }
    }
}
