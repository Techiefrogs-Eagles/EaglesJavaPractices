import java.util.ArrayList;

public class Program14 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("S");
        name.add("R");
        name.add("I");
        name.add("K");
        name.add("A");
        name.add("R");
        name.clear();
        System.out.println("Cleared all the content");

        for (String string : name) 
        {
            System.out.println(string);
        }
    }
}
