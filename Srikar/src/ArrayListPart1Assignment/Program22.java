import java.util.ArrayList;

public class Program22 {
    public static void main(String[] args) 
    {
        ArrayList<String> name = new ArrayList<String>();
        name.add("S");
        name.add("R");
        name.add("I");
        name.add("K");
        name.add("A");
        name.add("R");
        

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
    }
}
