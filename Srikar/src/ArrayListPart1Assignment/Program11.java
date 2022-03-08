import java.util.ArrayList;

public class Program11 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("S");
        colour.add("R");
        colour.add("I");
        colour.add("K");
        colour.add("A");
        colour.add("R");

        String temp = colour.get(2);
        colour.set(2, colour.get(5));
        colour.set(5, temp);

        for (String string : colour) 
        {
            System.out.println(string);
        }
    }
}